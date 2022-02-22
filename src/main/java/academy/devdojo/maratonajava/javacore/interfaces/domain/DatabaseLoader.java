package academy.devdojo.maratonajava.javacore.interfaces.domain;

//implements - para usar interfaces
public class DatabaseLoader implements DataLoader, DataRemover {
    // ordem de restrição: private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("Loading data from database...");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from database...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permissions from database");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("dento do retrieveDataSize da classe DatabaseLoader");
    }
}
