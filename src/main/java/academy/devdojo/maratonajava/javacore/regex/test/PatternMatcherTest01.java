package academy.devdojo.maratonajava.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "aba";
        String text = "abaababbab";
        String text2 = "abababa"; //ele não vai contar o aba do meio.

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);

        System.out.println("text:  " + text2);
        System.out.println("Index: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("positions result: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }
    }
}
