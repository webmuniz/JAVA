package academy.devdojo.maratonajava.javacore.polymorphism.service;

import academy.devdojo.maratonajava.javacore.polymorphism.domain.Product;
import academy.devdojo.maratonajava.javacore.polymorphism.domain.Tomato;

public class CalculatorFee {

    public static void calculateFee(Product product) {
        System.out.println("======= FEE REPORT =========");
        double fee = product.calcFee();
        System.out.println("Product: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Fee: " + fee);
        //Se o produto for uma instância de Tomate...
        if (product instanceof Tomato) {
            System.out.println("Expiration: " + ((Tomato) product).getExpirationDate());
        }
    }
}
