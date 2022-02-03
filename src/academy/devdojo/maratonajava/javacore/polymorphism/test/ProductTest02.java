package academy.devdojo.maratonajava.javacore.polymorphism.test;

import academy.devdojo.maratonajava.javacore.polymorphism.domain.Computer;
import academy.devdojo.maratonajava.javacore.polymorphism.domain.Product;
import academy.devdojo.maratonajava.javacore.polymorphism.domain.Tomato;

public class ProductTest02 {
    public static void main(String[] args) {
        Product product1 = new Computer("Ryzen 9", 3000);

        System.out.println(product1.getName());
        System.out.println(product1.calcFee());
        System.out.println("----------------------");
        Product product2 = new Tomato("Tomate Cereja", 30);

        System.out.println(product2.getName());
        System.out.println(product2.calcFee());
    }
}
