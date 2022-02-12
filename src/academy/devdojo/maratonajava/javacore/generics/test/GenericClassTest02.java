package academy.devdojo.maratonajava.javacore.generics.test;

import academy.devdojo.maratonajava.javacore.generics.domain.Boat;
import academy.devdojo.maratonajava.javacore.generics.service.RentalBoatService;

public class GenericClassTest02 {
    public static void main(String[] args) {
        RentalBoatService rentalBoatService = new RentalBoatService();
        Boat boat = rentalBoatService.retrieveAvailableBoat();
        System.out.println("Using boat for one month...");
        System.out.println("--------------");
        rentalBoatService.returnRentalBoat(boat);
    }
}
