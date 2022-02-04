package academy.devdojo.maratonajava.javacore.exceptions.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        newFile();
    }

    private static void newFile() throws IOException {
        File file = new File("assets\\test.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("File created successfully! :) " + isCreated);
        } catch (IOException e) { //Capturando a excessão específica; !!! JAMAIS DEIXAR EM BRANCO !!!!
            e.printStackTrace();
            throw e;
        }
    }
}
