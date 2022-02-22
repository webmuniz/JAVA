package academy.devdojo.maratonajava.javacore.nio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest01 {
    public static void main(String[] args) {
        final Path dir = Paths.get("/#JV");

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
            for (Path path : stream) {
                System.out.println(path.getFileName());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
