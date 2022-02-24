package academy.devdojo.maratonajava.javacore.jdbc.service;

import academy.devdojo.maratonajava.javacore.jdbc.domain.Producer;
import academy.devdojo.maratonajava.javacore.jdbc.repository.ProducerRepositoryRowSet;

import java.util.List;

public class ProducerServiceRowSet {

    public static List<Producer> findByNameRowSet(String name){
        return ProducerRepositoryRowSet.findByNameRowSet(name);
    }

    public static void updateRowSet(Producer producer){
        ProducerRepositoryRowSet.updateRowSet(producer);
    }

    public static void updateCachedRowSet(Producer producer){
        ProducerRepositoryRowSet.updateCachedRowSet(producer);
    }

}
