package academy.devdojo.maratonajava.javacore.nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {

    //BasicFileAttributesView (ambos) | DosFileAttributesView (windows) | PosixFileAttributesView (Unix)

    public static void main(String[] args) throws IOException {
        final Path path = Paths.get("folder/new_file.txt");
        final BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();

        //Return ZuluTime
        System.out.println("Creation Time: "+creationTime);
        System.out.println("Last Access Time: "+lastAccessTime);
        System.out.println("Last Modified Time: "+lastModifiedTime);

        //====================================================================
        System.out.println("----------------");

        final BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        final FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModifiedTime, newCreationTime, creationTime);

        creationTime = fileAttributeView.readAttributes().creationTime();
        lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();
        lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();

        //Return ZuluTime
        System.out.println("Creation Time: "+creationTime);
        System.out.println("Last Access Time: "+lastAccessTime);
        System.out.println("Last Modified Time: "+lastModifiedTime);


    }
}
