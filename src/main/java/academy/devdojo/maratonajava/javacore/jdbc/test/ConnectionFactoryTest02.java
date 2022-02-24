package academy.devdojo.maratonajava.javacore.jdbc.test;

import academy.devdojo.maratonajava.javacore.jdbc.domain.Producer;
import academy.devdojo.maratonajava.javacore.jdbc.service.ProducerService;
import academy.devdojo.maratonajava.javacore.jdbc.service.ProducerServiceRowSet;

public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        Producer producerUpdate = Producer.builder().id(1).name("DarkSide").build();
        ProducerServiceRowSet.updateCachedRowSet(producerUpdate);
        //ProducerServiceRowSet.findByNameRowSet("");

    }
}
