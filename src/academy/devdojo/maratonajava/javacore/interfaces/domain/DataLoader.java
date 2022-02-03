package academy.devdojo.maratonajava.javacore.interfaces.domain;

public interface DataLoader {
    //public static final - redundante!
    public static final int MAX_DATA_SIZE = 10;

    //public abstract é redundante!
    void load();
    default void checkPermission(){
        System.out.println("Checking permissions");
    }

    static void retrieveMaxDataSize(){
        System.out.println("dento do retrieveDataSize da interface");
    }
}
