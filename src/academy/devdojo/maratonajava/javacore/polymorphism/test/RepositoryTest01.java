package academy.devdojo.maratonajava.javacore.polymorphism.test;

import academy.devdojo.maratonajava.javacore.polymorphism.repository.Repository;
import academy.devdojo.maratonajava.javacore.polymorphism.service.RepositoryArchive;
import academy.devdojo.maratonajava.javacore.polymorphism.service.RepositoryDatabase;
import academy.devdojo.maratonajava.javacore.polymorphism.service.RepositoryMemory;

public class RepositoryTest01 {
    public static void main(String[] args) {
        Repository repository = new RepositoryArchive();
        repository.save();
    }
}
