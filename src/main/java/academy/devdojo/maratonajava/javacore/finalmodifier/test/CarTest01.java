package academy.devdojo.maratonajava.javacore.finalmodifier.test;

import academy.devdojo.maratonajava.javacore.finalmodifier.domain.Car;
import academy.devdojo.maratonajava.javacore.finalmodifier.domain.Ferrari;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(Car.LIMIT_SPEED);
        car1.BUYER.setName("Elvis");
        System.out.println(car1.BUYER);
        Ferrari ferrari = new Ferrari();
        ferrari.setModel("Enzo");
        ferrari.print();
    }
}
