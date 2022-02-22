package academy.devdojo.maratonajava.javacore.nio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {

        //BasicFileAttributes (ambos) | DosFileAttributes (windows) | PosixFileAttributes (Unix)

        final LocalDateTime date = LocalDateTime.now().minusDays(10);
        final File file = new File("folder/new.txt");

        final boolean isCreated = file.createNewFile();
        final boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli()); //The modification date will be minus 10 days

        //Utilizando recursos NIO
        final Path path = Paths.get("folder/new_path.txt");
        Files.createFile(path);
        final FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, fileTime);

        System.out.println(Files.isWritable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isExecutable(path));

    }
}
