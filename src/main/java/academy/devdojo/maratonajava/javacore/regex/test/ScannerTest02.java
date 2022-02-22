package academy.devdojo.maratonajava.javacore.regex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String text = "Levi,Eren,Mikasa,true,200";
        Scanner scanner = new Scanner(text);
        scanner.useDelimiter(",");
        while (scanner.hasNext()) { //Enquanto scanner tiver um próximo;
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("Int: " + i);
            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println("Bool: " + b);
            } else {
                System.out.println(scanner.next());
            }
        }
    }
}
