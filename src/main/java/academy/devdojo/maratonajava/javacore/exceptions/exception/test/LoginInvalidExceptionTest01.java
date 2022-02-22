package academy.devdojo.maratonajava.javacore.exceptions.exception.test;

import academy.devdojo.maratonajava.javacore.exceptions.exception.domain.InvalidLoginException;

import java.util.Scanner;

public class LoginInvalidExceptionTest01 {
    public static void main(String[] args) {
        try {
            Login();
        } catch (InvalidLoginException e) {
            e.printStackTrace();
        }
    }

    public static void Login() throws InvalidLoginException {
        Scanner keyboard = new Scanner(System.in);
        String usernameDB = "Elvis";
        String passwordDB = "12345";

        System.out.println("Username:");
        String usernameTyped = keyboard.nextLine();
        System.out.println("Password:");
        String passwordTyped = keyboard.nextLine();

        if (!usernameDB.equals(usernameTyped) || !passwordDB.equals(passwordTyped)) {
            throw new InvalidLoginException(":( Invalid username or password...");
        }
        System.out.println("Logged User! :)");
    }
}
