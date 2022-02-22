package academy.devdojo.maratonajava.javacore.polymorphism.test;

import academy.devdojo.maratonajava.javacore.polymorphism.domain.Computer;
import academy.devdojo.maratonajava.javacore.polymorphism.domain.Tomato;
import academy.devdojo.maratonajava.javacore.polymorphism.domain.Tv;
import academy.devdojo.maratonajava.javacore.polymorphism.service.CalculatorFee;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Notebook Dell G500", 6600);
        Tomato tomato1 = new Tomato("Tomate Cereja", 10);
        Tv tv1 = new Tv("Samsung 50\"", 2600);

        CalculatorFee.calculateFee(computer1);
        CalculatorFee.calculateFee(tomato1);
        CalculatorFee.calculateFee(tv1);
    }
}
