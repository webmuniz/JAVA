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

            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)){
                log.info("Supports TYPE_FORWARD_ONLY");
                if(dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE));
                log.info("And supports CONCUR_UPDATABLE");
            }

            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)){
                log.info("Supports TYPE_SCROLL_INSENSITIVE");
                if(dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE));
                log.info("And supports CONCUR_UPDATABLE");
            }

            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)){
                log.info("Supports TYPE_FORWARD_ONLY");
                if(dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE));
                log.info("And supports CONCUR_UPDATABLE");
            }

        } catch (SQLException e) {
            log.error("Error while trying to find metadata from driver", e);
        }
    }
}
