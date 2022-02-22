package academy.devdojo.maratonajava.javacore.designpatterns.test;

import academy.devdojo.maratonajava.javacore.designpatterns.domain.Country;
import academy.devdojo.maratonajava.javacore.designpatterns.domain.Currency;
import academy.devdojo.maratonajava.javacore.designpatterns.domain.CurrencyFactory;

public class FactoryTest01 {
    public static void main(String[] args) {
        final Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
