package academy.devdojo.maratonajava.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d - Todos os dígitos
        // \D - Tudo que não é dígito
        // \s - todos os espaços em branco \t \n \f \r
        // \S - Todos os caracteres excluindo os brancos
        // \w - a-Z A-Z, dígitos, _  sem espaços e caracteres especiais
        // \W - Tudo que não está incluso no \w

        String regex = "\\W";
        String text2 = "Today is 07/02/2022!_";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);

        System.out.println("text:  " + text2);
        System.out.println("Index: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("positions result: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " - " + matcher.group() + " | ");
        }
    }
}
