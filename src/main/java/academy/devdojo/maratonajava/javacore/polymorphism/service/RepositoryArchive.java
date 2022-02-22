package academy.devdojo.maratonajava.javacore.polymorphism.service;

import academy.devdojo.maratonajava.javacore.polymorphism.repository.Repository;

public class RepositoryArchive implements Repository {
    @Override
    public void save() {
        System.out.println("Saving to archive...");
    }
}
