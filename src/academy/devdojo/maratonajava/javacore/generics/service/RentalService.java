package academy.devdojo.maratonajava.javacore.generics.service;

import academy.devdojo.maratonajava.javacore.generics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class RentalService<T> {
    private List<T> availableVehicles;

    public RentalService(List<T> availableVehicles) {
        this.availableVehicles = availableVehicles;
    }

    public T retrieveAvailableVehicle() {
        System.out.println("Search to available vehicle...");
        T t = availableVehicles.remove(1);
        System.out.println("Renting vehicle: " + t);
        System.out.println("Availables vehicles:");
        System.out.println(availableVehicles);
        return t;
    }

    public void returnRentalVehicle(T t) {
        System.out.println("Return vehicle: " + t);
        availableVehicles.add(t);
        System.out.println("Availables vehicles:");
        System.out.println(availableVehicles);
    }
}
