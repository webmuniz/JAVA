package academy.devdojo.maratonajava.javacore.jdbc.service;

import academy.devdojo.maratonajava.javacore.jdbc.domain.Producer;
import academy.devdojo.maratonajava.javacore.jdbc.repository.ProducerRepository;

import java.util.List;

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

    public static void updatePreparedStatement(Producer producer) {
        requiredValidId(producer.getId());
        ProducerRepository.updatePreparedStatement(producer);
    }

    public static List<Producer> findAll(){
        return ProducerRepository.findAll();
    }

    public static List<Producer> findByName(String name){
        return ProducerRepository.findByName(name);
    }

    public static List<Producer> findByNamePreparedStatement(String name){
        return ProducerRepository.findByNamePreparedStatement(name);
    }

    public static void showProducerMetadata(){
        ProducerRepository.showProducerMetadata();
    }

    public static void showDriverMetadata(){
        ProducerRepository.showDriverMetadata();
    }

    public static void showTypeScrollWroking(){
        ProducerRepository.showTypeScrollWroking();
    }

    public static void findByNameAndUpdateToUpperCase(String name){
        ProducerRepository.findByNameAndUpdateToUpperCase(name);
    }

    public static List<Producer> findByNameAndInsertWhenNotFound(String name){
        return ProducerRepository.findByNameAndInsertWhenNotFound(name);
    }

    public static void findByNameAndDelete(String name){
        ProducerRepository.findByNameAndDelete(name);
    }

    private static void requiredValidId(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Invalid value for id");
        }
    }
}
