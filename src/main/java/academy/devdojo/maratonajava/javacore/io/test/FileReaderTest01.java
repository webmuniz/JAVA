package academy.devdojo.maratonajava.javacore.io.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file)) {
//            char[] in = new char[(int)file.lenght()];
//            fr.read(in); //coloca o que leu dentro do array in
//            for (char c : in) {
//                System.out.print(c);
//            }
            int i;
            while ((i=fr.read()) != -1){
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
