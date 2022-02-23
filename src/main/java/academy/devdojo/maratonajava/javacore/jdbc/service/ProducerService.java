package academy.devdojo.maratonajava.javacore.jdbc.service;

import academy.devdojo.maratonajava.javacore.jdbc.domain.Producer;
import academy.devdojo.maratonajava.javacore.jdbc.repository.ProducerRepository;

public class ProducerService {

    public static void insert(Producer producer) {
        ProducerRepository.insert(producer);
    }

    public static void delete(Integer id) {
        requiredValidId(id);
        ProducerRepository.delete(id);
    }

    public static void update(Producer producer) {
        requiredValidId(producer.getId());
        ProducerRepository.update(producer);
    }

    private static void requiredValidId(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Invalid value for id");
        }
    }
}
