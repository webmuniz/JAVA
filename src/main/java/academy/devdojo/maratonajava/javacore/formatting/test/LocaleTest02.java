package academy.devdojo.maratonajava.javacore.formatting.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        System.out.println("--- COUNTRIES ---");
        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry + " | ");
        }
        System.out.println("\n--- LANGUAGES ---");
        for (String isolanguage : isoLanguages) {
            System.out.print(isolanguage + " | ");
        }

    }
}
