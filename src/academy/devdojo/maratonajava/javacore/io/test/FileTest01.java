package academy.devdojo.maratonajava.javacore.io.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.text");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created: "+isCreated);
            System.out.println("Path: "+file.getPath());
            System.out.println("Absolut path: "+file.getAbsolutePath());
            System.out.println("is directory?: "+file.isDirectory());
            System.out.println("is file?: "+file.isFile());
            System.out.println("is hidden?: "+file.isHidden());
            System.out.println("Last modified: "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));

            boolean exists = file.exists();
            if (exists){
                System.out.println("Deleted: "+file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
