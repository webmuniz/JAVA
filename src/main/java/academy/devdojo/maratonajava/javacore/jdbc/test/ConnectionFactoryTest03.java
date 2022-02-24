package academy.devdojo.maratonajava.javacore.jdbc.test;

import academy.devdojo.maratonajava.javacore.jdbc.domain.Producer;
import academy.devdojo.maratonajava.javacore.jdbc.service.ProducerService;

import java.util.List;

public class ConnectionFactoryTest03 {
    public static void main(String[] args) {

        Producer producer1 = Producer.builder().name("Toei Anime").build();
        Producer producer2 = Producer.builder().name("Bandai").build();
        Producer producer3 = Producer.builder().name("Toryama").build();

        ProducerService.saveTransaction(List.of(producer1, producer2, producer3));

    }
}
