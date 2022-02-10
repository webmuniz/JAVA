package academy.devdojo.maratonajava.javacore.formatting.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeUS = Locale.US;
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getCurrencyInstance(); //Default do sistema
        nfa[1] = NumberFormat.getCurrencyInstance(localeUS);
        nfa[2] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);

        double value = 1000.325;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(value));
        }


        String valueString = "$1000.325"; //Ao se tratar de moedas precisa-se usar o síbolo dela e o formato '.' ou ','
        try {
            System.out.println(nfa[1].parse(valueString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
