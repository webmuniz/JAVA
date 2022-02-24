package academy.devdojo.maratonajava.javacore.jdbc.repository;

import academy.devdojo.maratonajava.javacore.jdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.jdbc.domain.Producer;
import academy.devdojo.maratonajava.javacore.jdbc.listener.CustomRowSetListener;
import lombok.extern.log4j.Log4j2;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Log4j2
public class ProducerRepositoryRowSet {

    public static List<Producer> findByNameRowSet(String name){
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        List<Producer> producers = new ArrayList<>();

        try(JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()){
            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setString(1, String.format("%%%s%%", name));
            jrs.execute(); //Used only to fetch data, not insert

            while (jrs.next()){
                final Producer producer = Producer.builder()
                        .id(jrs.getInt("id"))
                        .name(jrs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        log.info(producers);
        return producers;
    }

    public static void updateRowSet(Producer producer){
        String sql = "SELECT * FROM anime_store.producer WHERE (`id` = ?);";

        try(JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()){
            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setInt(1, producer.getId());
            jrs.execute(); //Used only to fetch data, not insert
            if (!jrs.next()) return;
            jrs.updateString("name", producer.getName());
            jrs.updateRow();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateCachedRowSet(Producer producer){
        String sql = "SELECT * FROM producer WHERE (`id` = ?);";

        try(CachedRowSet crs = ConnectionFactory.getcCachedRowSet();
            Connection connection = ConnectionFactory.getConnection()){
            //crs.addRowSetListener(new CustomRowSetListener());
            connection.setAutoCommit(false); //I don't want to let the database permanently persist the data
            crs.setCommand(sql);
            crs.setInt(1, producer.getId());
            crs.execute(connection); //Used only to fetch data, not insert

            if (!crs.next()) return;
            crs.updateString("name", producer.getName());
            crs.updateRow();

            TimeUnit.SECONDS.sleep(10);

            crs.acceptChanges();
        } catch (SQLException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
