package academy.devdojo.maratonajava.javacore.regex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        // . - exemplo: 1.3 = 123, 133, 1@3 ou seja, tudo que fica entre um 1 e um 3

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String text = "luffy@hotmail.com, 123jotaro@gmail.com, #%!zoro@mail.br, test@gmail.com.br, sakura@mail";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("text:  " + text);
        System.out.println("regex: " + regex);
        System.out.println("positions result: ");
        while (matcher.find()) {
            System.out.println(matcher.start() + " - " + matcher.group());
        }

        //descobrir se é valido individualmente:
        System.out.println("#%!zoro@mail.br".matches(regex));

        //Quebrando text em um array de Strings:
        System.out.println(Arrays.toString(text.split(",")));
        System.out.println(text.split(",")[1].trim()); // remove espaço
    }
}
