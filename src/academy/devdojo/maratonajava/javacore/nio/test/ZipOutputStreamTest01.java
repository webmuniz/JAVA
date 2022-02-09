package academy.devdojo.maratonajava.javacore.nio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path fileZip = Paths.get("folder/file.zip");
        Path filesToZip = Paths.get("folder/subfolder1/subsub1");

        zip(fileZip, filesToZip);

    }

    private static void zip(Path fileZip, Path filesToZip) {
        try (ZipOutputStream ziped = new ZipOutputStream(Files.newOutputStream(fileZip));
             DirectoryStream<Path> directoryStream = Files.newDirectoryStream(filesToZip)) {

            for (Path file : directoryStream) {

                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                ziped.putNextEntry(zipEntry);
                Files.copy(file, ziped); //If you don't, the file is created just empty.
                ziped.closeEntry();
            }
            System.out.println("Arquivo criado");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
