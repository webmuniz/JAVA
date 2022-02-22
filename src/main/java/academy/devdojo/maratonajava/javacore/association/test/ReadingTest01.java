package academy.devdojo.maratonajava.javacore.association.test;

import java.util.Scanner;

public class ReadingTest01 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter yout name below:");
        String name = keyboard.nextLine();

        System.out.println("Enter yout age below:");
        int age = keyboard.nextInt();

        System.out.println("Enter your gender [M or F]:");
        char gender = keyboard.next().charAt(0);

        System.out.println("---------------------------");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
    }
}
