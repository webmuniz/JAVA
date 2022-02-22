package academy.devdojo.maratonajava.javacore.exceptions.exception.test;

import academy.devdojo.maratonajava.javacore.exceptions.exception.domain.Reader1;
import academy.devdojo.maratonajava.javacore.exceptions.exception.domain.Reader2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        readFile();
    }

    //Método usando Try With Resources:
    public static void readFile() {
        //usando o try with resources não precisa do catch ou finally;
        //abaixo vai ler da direita para esquerda.
        try (Reader1 reader1 = new Reader1();
             Reader2 reader2 = new Reader2()) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Método usando a maneira mais trabalhosa:
    public static void readFile2() {
        Reader reader = null;
        try {
            reader = new BufferedReader((new FileReader("test.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
