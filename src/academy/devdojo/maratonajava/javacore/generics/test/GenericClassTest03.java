package academy.devdojo.maratonajava.javacore.generics.test;

import academy.devdojo.maratonajava.javacore.generics.domain.Boat;
import academy.devdojo.maratonajava.javacore.generics.domain.Car;
import academy.devdojo.maratonajava.javacore.generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class GenericClassTest03 {
    public static void main(String[] args) {
        List<Car> availableCars = new ArrayList<>(List.of(new Car("BMW"), new Car("Fusca")));
        List<Boat> availableBoats = new ArrayList<>(List.of(new Boat("Lancha"), new Boat("Canoa")));

        RentalService<Car> rentalServiceCar = new RentalService<>(availableCars);
        Car car = rentalServiceCar.retrieveAvailableVehicle();
        System.out.println("Using car for one month...");
        rentalServiceCar.returnRentalVehicle(car);

        System.out.println("========================");

        RentalService<Boat> rentalServiceBoat = new RentalService<>(availableBoats);
        Boat boat = rentalServiceBoat.retrieveAvailableVehicle();
        System.out.println("Using boat for one month...");
        rentalServiceBoat.returnRentalVehicle(boat);

    }
}
