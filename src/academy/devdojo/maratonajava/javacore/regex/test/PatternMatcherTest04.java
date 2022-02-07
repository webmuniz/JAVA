package academy.devdojo.maratonajava.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d - Todos os dígitos
        // \D - Tudo que não é dígito
        // \s - todos os espaços em branco \t \n \f \r
        // \S - Todos os caracteres excluindo os brancos
        // \w - a-Z A-Z, dígitos, _  sem espaços e caracteres especiais
        // \W - Tudo que não está incluso no \w

        //[]

        // ? zero ou uma ocorrência
        // * zero ou mais ocorrências
        // + uma ou mais ocorrências
        // {n1, n2} de n1 até n2 ocorrências
        // () agrupamento
        // | ou - exemplo: o(v|c)o - ovo ou oco
        // $ fim


        //EXERCÍCIO - PROCURANDO NÚMEROS EXADECIMAIS VÁLIDOS:

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String text = "12 0x 0X 0xFFABC 0x10G 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("text:  " + text);
        System.out.println("regex: " + regex);
        System.out.println("positions result: ");
        while (matcher.find()) {
            System.out.println(matcher.start() + " - " + matcher.group());
        }
    }
}
