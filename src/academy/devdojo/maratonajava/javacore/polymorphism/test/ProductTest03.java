package academy.devdojo.maratonajava.javacore.polymorphism.test;

import academy.devdojo.maratonajava.javacore.polymorphism.domain.Computer;
import academy.devdojo.maratonajava.javacore.polymorphism.domain.Product;
import academy.devdojo.maratonajava.javacore.polymorphism.domain.Tomato;
import academy.devdojo.maratonajava.javacore.polymorphism.service.CalculatorFee;

public class ProductTest03 {
    public static void main(String[] args) {
        Product product1 = new Computer("Ryzen 9", 3000);
        Tomato tomato1 = new Tomato("Tomate Cereja", 20);
        tomato1.setExpirationDate("25/02/2022");

        CalculatorFee.calculateFee(tomato1);
        CalculatorFee.calculateFee(product1);
    }
}
