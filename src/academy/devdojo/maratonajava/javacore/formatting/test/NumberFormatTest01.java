package academy.devdojo.maratonajava.javacore.formatting.test;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeUS = Locale.US;
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getInstance(); //Default do sistema
        nfa[1] = NumberFormat.getInstance(localeUS);
        nfa[2] = NumberFormat.getInstance(localeJP);
        nfa[3] = NumberFormat.getInstance(localeIT);

        double value = 1_000.325;

        for (NumberFormat numberFormat : nfa) {
            numberFormat.setMaximumFractionDigits(2); //usar 2 casas decimais!
            System.out.println(numberFormat.format(value));
        }

        String valueString = "1000.325";
        try {
            System.out.println(nfa[1].parse(valueString));;
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
