package academy.devdojo.maratonajava.javacore.jdbc.test;

import academy.devdojo.maratonajava.javacore.jdbc.domain.Producer;
import academy.devdojo.maratonajava.javacore.jdbc.repository.ProducerRepository;

public class ConnectionFactoryTest {
    public static void main(String[] args) {
        Producer konami = Producer.ProducerBuilder.builder()
                .name("Konami")
                .build();
        ProducerRepository.save(konami);
    }
}
