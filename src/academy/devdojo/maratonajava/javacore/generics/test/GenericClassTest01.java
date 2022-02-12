package academy.devdojo.maratonajava.javacore.generics.test;

import academy.devdojo.maratonajava.javacore.generics.domain.Car;
import academy.devdojo.maratonajava.javacore.generics.service.RentalCarService;

public class GenericClassTest01 {
    public static void main(String[] args) {
        RentalCarService rentalCarService = new RentalCarService();
        Car car = rentalCarService.retrieveAvailableCar();
        System.out.println("Using car for one month...");
        System.out.println("--------------");
        rentalCarService.returnRentalCar(car);
    }
}
