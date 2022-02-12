package academy.devdojo.maratonajava.javacore.generics.service;

import academy.devdojo.maratonajava.javacore.generics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class RentalCarService {
    private List<Car> availableCars = new ArrayList<>(List.of(new Car("BMW"), new Car("Fusca")));

    public Car retrieveAvailableCar(){
        System.out.println("Search to available cars...");
        Car car = availableCars.remove(1);
        System.out.println("Renting car: "+car);
        System.out.println("Availables cars:");
        System.out.println(availableCars);
        return car;
    }

    public void returnRentalCar(Car car){
        System.out.println("Return car: "+car);
        availableCars.add(car);
        System.out.println("Availables cars:");
        System.out.println(availableCars);
    }
}
