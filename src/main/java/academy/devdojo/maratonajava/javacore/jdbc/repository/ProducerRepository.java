package academy.devdojo.maratonajava.javacore.jdbc.repository;

import academy.devdojo.maratonajava.javacore.jdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.jdbc.domain.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

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
}
