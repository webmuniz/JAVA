package academy.devdojo.maratonajava.javacore.interfaces.domain;

//implements - para usar interfaces
public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Loading files from database...");
    }

    @Override
    public void remove() {
        System.out.println("Removing files from database...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permissions from files");
    }
}
