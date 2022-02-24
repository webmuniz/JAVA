package academy.devdojo.maratonajava.javacore.jdbc.repository;

import academy.devdojo.maratonajava.javacore.jdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.jdbc.domain.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {

    public static void insert(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection conn = ConnectionFactory.getConnection(); Statement stmt = conn.createStatement()) {

            final int rowsAffected = stmt.executeUpdate(sql);
            log.info("Inserted producer '{}' Database rows affected: '{}'", producer.getName(), rowsAffected);

        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", producer.getName(), e);
        }
    }

    public static void saveTransaction(List<Producer> producers) {
        try (Connection conn = ConnectionFactory.getConnection()){
            conn.setAutoCommit(false);
            preparedStatementSaveTransation(conn, producers);
            conn.commit();
        } catch (SQLException e) {
            log.error("Error while trying to save producers '{}'", producers , e);
        }
    }

    private static void preparedStatementSaveTransation(Connection conn, List<Producer> producers) throws SQLException {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES (?);";
        boolean shouldRollback = false;
        for(Producer p: producers){
            try( PreparedStatement ps = conn.prepareStatement(sql)){
                log.info("Saving producer '{}'", p.getName());
                ps.setString(1, p.getName());
                ps.execute();
            }catch (SQLException e){
                e.printStackTrace();
                shouldRollback = true;
            }
        }
        if (shouldRollback) conn.rollback();
    }

    public static void delete(int id) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d');".formatted(id);

        try (Connection conn = ConnectionFactory.getConnection(); Statement stmt = conn.createStatement()) {

            final int rowsAffected = stmt.executeUpdate(sql);
            log.info("Deleted producer id['{}'] from Database rows affected: '{}'", id, rowsAffected);

        } catch (SQLException e) {
            log.error("Error while trying to delete producer id['{}']", id, e);
        }
    }

    public static void update(Producer producer) {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = '%s' WHERE (`id` = '%s');"
                .formatted(producer.getName(), producer.getId());

        try (Connection conn = ConnectionFactory.getConnection(); Statement stmt = conn.createStatement()) {

            final int rowsAffected = stmt.executeUpdate(sql);
            log.info("Updated producer id['{}'] from Database rows affected: '{}'", producer.getId(), rowsAffected);

        } catch (SQLException e) {
            log.error("Error while trying to update producer id['{}']", producer.getId(), e);
        }
    }

    public static void updatePreparedStatement(Producer producer) {

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementUpdate(conn, producer)) {

            final int rowsAffected = ps.executeUpdate();
            log.info("Updated producer id['{}'] from Database rows affected: '{}'", producer.getId(), rowsAffected);

        } catch (SQLException e) {
            log.error("Error while trying to update producer id['{}']", producer.getId(), e);
        }
    }

    public static List<Producer> findByName(String name) {
        log.info("Finding producers by name...");
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';".formatted(name);
        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                var idDb = rs.getInt("id");
                var nameDb = rs.getString("name");

                final Producer producer = Producer.builder().id(idDb).name(nameDb).build();
                producers.add(producer);
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all producers from database", e);
        }

        log.info(producers);
        return producers;
    }

    public static List<Producer> findByNamePreparedStatement(String name) {
        log.info("Finding producers by name...");
        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                var idDb = rs.getInt("id");
                var nameDb = rs.getString("name");

                final Producer producer = Producer.builder().id(idDb).name(nameDb).build();
                producers.add(producer);
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all producers from database", e);
        }

        log.info(producers);
        return producers;
    }

    public static List<Producer> findByNameCallableStatement(String name) {  //Used to call stored produces or functions in the Database
        log.info("Finding producers by name...");
        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = callableStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                var idDb = rs.getInt("id");
                var nameDb = rs.getString("name");

                final Producer producer = Producer.builder().id(idDb).name(nameDb).build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers from database", e);
        }
        log.info(producers);
        return producers;
    }

    public static List<Producer> findAll() {
        log.info("Finding All producers...");
        return findByName("");
//        String sql = "SELECT id, name FROM anime_store.producer;";
//        List<Producer> producers = new ArrayList<>();
//
//        try (Connection conn = ConnectionFactory.getConnection();
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(sql)) {
//
//            while (rs.next()) {
//                var id = rs.getInt("id");
//                var name = rs.getString("name");
//
//                final Producer producer = Producer.builder().id(id).name(name).build();
//                producers.add(producer);
//            }
//
//        } catch (SQLException e) {
//            log.error("Error while trying to find all producers from database", e);
//        }
//
//        log.info(producers);
//        return producers;
    }

    public static void showProducerMetadata() {
        log.info("Showing producer metadata...");
        String sql = "SELECT * FROM anime_store.producer;";

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            ResultSetMetaData rsMetaData = rs.getMetaData();
            int columnCount = rsMetaData.getColumnCount();
            log.info("Columns count '{}'", columnCount);

            for (int i = 1; i <= columnCount; i++) {
                log.info("Table name: '{}'", rsMetaData.getTableName(i));
                log.info("Column name: '{}'", rsMetaData.getColumnName(i));
                log.info("Column size: '{}'", rsMetaData.getColumnDisplaySize(i));
                log.info("Column type: '{}'", rsMetaData.getColumnTypeName(i));
            }

        } catch (SQLException e) {
            log.error("Error while trying to find metadata producers from database", e);
        }
    }

    public static void showDriverMetadata() {
        log.info("Showing driver metadata...");
        String sql = "SELECT * FROM anime_store.producer;";

        try (Connection conn = ConnectionFactory.getConnection()) {
            final DatabaseMetaData dbMetaData = conn.getMetaData();

            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                log.info("Supports TYPE_FORWARD_ONLY");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) ;
                log.info("And supports CONCUR_UPDATABLE");
            }

            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                log.info("Supports TYPE_SCROLL_INSENSITIVE");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE))
                    ;
                log.info("And supports CONCUR_UPDATABLE");
            }

            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                log.info("Supports TYPE_FORWARD_ONLY");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE))
                    ;
                log.info("And supports CONCUR_UPDATABLE");
            }

        } catch (SQLException e) {
            log.error("Error while trying to find metadata from driver", e);
        }
    }

    public static void showTypeScrollWroking() {
        log.info("Finding ...");
        String sql = "SELECT * FROM anime_store.producer;"; //order by name desc; - invert order

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {

            //REMEMBER! - Cursor concept!
            //Moving cursor:
            //rs.next()
            //rs.previous()

            //get last row:
            log.info("Last row? '{}'", rs.last());
            log.info("Row number? '{}'", rs.getRow());
            log.info(Producer.builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build());
            log.info("------");

            //get first row:
            log.info("First row? '{}'", rs.first());
            log.info("Row number? '{}'", rs.getRow());
            log.info(Producer.builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build());
            log.info("------");

            //get row absolute inputting row:
            log.info("Row absolute? '{}'", rs.absolute(2));
            log.info("Row number? '{}'", rs.getRow());
            log.info(Producer.builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build());
            log.info("------");

            //get relative row by inputting:
            log.info("Row relative? '{}'", rs.relative(-1));
            log.info("Row number? '{}'", rs.getRow());
            log.info(Producer.builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build());
            log.info("------");

            //is last/after row:
            log.info("Is last row? '{}'", rs.isLast()); //Don't move cursor
            log.info("Is last row? '{}'", rs.isAfterLast()); //Don't move cursor
            log.info("------");

            //is first/before row:
            log.info("Is first row? '{}'", rs.isFirst()); //Don't move cursor
            log.info("Is first row? '{}'", rs.isBeforeFirst()); //Don't move cursor

        } catch (SQLException e) {
            log.error("Error while trying to find...", e);
        }
    }

    public static void findByNameAndUpdateToUpperCase(String name) {
        log.info("Finding producers by name and update to UpperCase...");
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';".formatted(name);
        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                rs.updateString("name", rs.getString("name").toUpperCase());
                rs.cancelRowUpdates(); //Cancel row update - USE BEFORE!
                rs.updateRow(); //Important to apply the changes

                var idDb = rs.getInt("id");
                var nameDb = rs.getString("name");

                final Producer producer = Producer.builder().id(idDb).name(nameDb).build();
                producers.add(producer);
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all producers from database", e);
        }

        log.info(producers);
    }

    public static List<Producer> findByNameAndInsertWhenNotFound(String name) {
        log.info("Finding producers by name ...");
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';".formatted(name);
        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) return producers;

            insertNewProducer(name, rs);
            producers.add(getProducer(rs));

        } catch (SQLException e) {
            log.error("Error while trying to find all producers from database", e);
        }
        log.info(producers);
        return producers;
    }

    public static void findByNameAndDelete(String name) {
        log.info("Finding producers by name and delete...");
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';".formatted(name);

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                log.info("Deleting: '{}'", rs.getString("name"));
                rs.deleteRow();
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all producers from database", e);
        }
    }

    //Created for support:

    private static PreparedStatement preparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where name like ?;"; //? - wild card

        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%",name));
        return ps;
    }

    private static CallableStatement callableStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "CALL `anime_store`.`sp_get_producer_by_name`(?);"; //? - wild card

        CallableStatement cs = conn.prepareCall(sql);
        cs.setString(1, String.format("%%%s%%",name));
        return cs;
    }

    private static PreparedStatement preparedStatementUpdate(Connection conn, Producer producer) throws SQLException {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = ? WHERE (`id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;
    }

    private static void insertNewProducer(String name, ResultSet rs) throws SQLException {
        rs.moveToInsertRow();
        rs.updateString("name", name);
        rs.insertRow();
    }

    private static Producer getProducer(ResultSet rs) throws SQLException {
        rs.beforeFirst();
        rs.next();
        return Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build();
    }
}
