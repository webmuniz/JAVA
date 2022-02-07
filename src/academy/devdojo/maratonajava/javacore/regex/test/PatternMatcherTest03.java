package academy.devdojo.maratonajava.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d - Todos os dígitos
        // \D - Tudo que não é dígito
        // \s - todos os espaços em branco \t \n \f \r
        // \S - Todos os caracteres excluindo os brancos
        // \w - a-Z A-Z, dígitos, _  sem espaços e caracteres especiais
        // \W - Tudo que não está incluso no \w

        //[]

        String regex = "0[xX][0-9a-fA-F]";
        String text2 = "12 0x 0X 0xFFABC 0x109 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);

        System.out.println("text:  " + text2);
        System.out.println("regex: " + regex);
        System.out.println("positions result: ");
        while (matcher.find()) {
            System.out.println(matcher.start() + " - " + matcher.group());
        }

        int hexNumber = 0x1; // colocar 0x quando for número hex.
        System.out.println(hexNumber); // Vai imprimir em decimal!
    }
}
