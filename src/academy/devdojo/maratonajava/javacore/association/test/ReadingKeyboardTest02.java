package academy.devdojo.maratonajava.javacore.association.test;

import java.util.Scanner;

public class ReadingKeyboardTest02 {
    public static void main(String[] args) {

        Scanner scannerKeyboard = new Scanner(System.in);

        System.out.println("*********************************");
        System.out.println("The great forecasting software!".toUpperCase());
        System.out.println("*********************************");

        System.out.println("\nType your question and I'll answer!");
        String question1 = scannerKeyboard.nextLine();
        System.out.println("Yep!");

        System.out.println("\nType your question again, and I'll answer!");
        String question2 = scannerKeyboard.nextLine();
        System.out.println("Nop!");
    }
}
