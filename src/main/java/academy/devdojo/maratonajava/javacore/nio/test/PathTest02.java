package academy.devdojo.maratonajava.javacore.nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        //Create directory
        Path folderPath = Paths.get("folder");
        if (Files.notExists(folderPath)){
            Files.createDirectory(folderPath);
        }

        //Create directories path
        Path subFolderPath = Paths.get("folder/subfolder/subsubfolder");
        if (Files.notExists(subFolderPath)){
            Files.createDirectories(subFolderPath);
        }

        //Create file in directory
        Path filePath = Paths.get(subFolderPath.toString(), "file.txt");
        if (Files.notExists(filePath)) {
            Path filePathCreated = Files.createFile(filePath);
        }else {
            System.out.println("the file already exists! :)");
        }

        //Rename file
        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file-renamed.txt"); //Need to convert to String
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING); //Replaces content
    }
}
