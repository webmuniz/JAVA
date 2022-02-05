package academy.devdojo.maratonajava.javacore.string.test;

import java.util.Locale;

public class StringTest02 {
    public static void main(String[] args) {
        String name = "Elvis";
        String numbers = "012345";

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(4));

        System.out.println(name.length());

        System.out.println(name.replace("s", "x"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(numbers.length());
        System.out.println(numbers.substring(0,3)); // Do indice 0 até...
        System.out.println(numbers.substring(3, numbers.length())); // Do indice 3 até o final
        System.out.println(numbers.substring(3)); // Não precisa escrever conforme acima

        System.out.println(name.trim()); // remove valores em branco no começo e no fim
    }
}
