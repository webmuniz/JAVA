package academy.devdojo.maratonajava.javacore.crud.repository;

import academy.devdojo.maratonajava.javacore.crud.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.crud.domain.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class ProducerRepository {

    public static List<Producer> findByName(String name) {
        log.info("Finding producers by name {}", name);
        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindByName(conn, name);
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

    public static Optional<Producer> findById(Integer id) {
        log.info("Finding producers by id {}", id);

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindById(conn, id);
             ResultSet rs = ps.executeQuery()) {
            if (!rs.next()) return Optional.empty();

            return Optional.of(Producer.builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build());
        } catch (SQLException e) {
            log.error("Error while trying to find all producers from database", e);
        }
        return Optional.empty();
    }

    public static void delete(int id) {

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementDelete(conn, id)) {

            ps.execute();
            log.info("Deleted producer id['{}'] from Database ", id);

        } catch (SQLException e) {
            log.error("Error while trying to delete producer id['{}']", id, e);
        }
    }

    public static void save(Producer producer) {
        log.info("Saving producer...");
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementSave(conn, producer)) {

            ps.execute();

        } catch (SQLException e) {
            log.error("Error while trying to update producer id['{}']", producer.getId(), e);
        }
    }

    public static void update(Producer producer) {
        log.info("Updating producer '{}", producer);

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementUpdate(conn, producer)) {
            ps.execute();

        } catch (SQLException e) {
            log.error("Error while trying to update producer id['{}']", producer.getId(), e);
        }
    }

    //support classes
    private static PreparedStatement createPreparedStatementSave(Connection conn, Producer producer) throws SQLException {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES (?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        return ps;
    }

    private static PreparedStatement createPreparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where name like ?;"; //? - wild card
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    private static PreparedStatement createPreparedStatementFindById(Connection conn, Integer id) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where id = ?;"; //? - wild card
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    private static PreparedStatement createPreparedStatementDelete(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = ?);";

        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    private static PreparedStatement createPreparedStatementUpdate(Connection conn, Producer producer) throws SQLException {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = ? WHERE (`id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;
    }

}
