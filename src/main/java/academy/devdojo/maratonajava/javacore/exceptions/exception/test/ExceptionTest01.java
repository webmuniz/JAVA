package academy.devdojo.maratonajava.javacore.exceptions.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        newFile();
    }

    private static void newFile() {
        File file = new File("assets\\test.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("File created successfully! :) " + isCreated);
        } catch (IOException e) { //Capturando a excessão específica; !!! JAMAIS DEIXAR EM BRANCO !!!!
            e.printStackTrace();
        }
    }
}
