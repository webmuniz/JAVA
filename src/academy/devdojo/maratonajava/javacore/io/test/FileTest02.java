package academy.devdojo.maratonajava.javacore.io.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {

        //Create directory
        File fileDirectory = new File("folder");
        boolean isDirectoryCreated = fileDirectory.mkdir();
        System.out.println("created folder? "+isDirectoryCreated);

        //Create file
        File fileFolderDirectory = new File(fileDirectory, "file.txt");
        final boolean isFileCreated = fileFolderDirectory.createNewFile();
        System.out.println("created file? "+isFileCreated);

        //Rename file
        File fileRenamed = new File(fileDirectory,"renamed-file.txt");
        boolean isRenamed = fileFolderDirectory.renameTo(fileRenamed);
        System.out.println("renamed file? "+isRenamed);

        //Rename directory
        File renamedDirectory = new File("folder2");
        final boolean isDirectoryRenamed = fileDirectory.renameTo(renamedDirectory);
        System.out.println("renamed folder? "+isDirectoryRenamed);

    }
}
