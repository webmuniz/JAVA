package academy.devdojo.maratonajava.javacore.generics.service;

import academy.devdojo.maratonajava.javacore.generics.domain.Boat;

import java.util.ArrayList;
import java.util.List;

public class RentalBoatService {
    private List<Boat> availableBoats = new ArrayList<>(List.of(new Boat("Lancha"), new Boat("Canoa")));

    public Boat retrieveAvailableBoat(){
        System.out.println("Search to available boats...");
        Boat boat = availableBoats.remove(1);
        System.out.println("Renting boat: "+boat);
        System.out.println("Availables boats:");
        System.out.println(availableBoats);
        return boat;
    }

    public void returnRentalBoat(Boat boat){
        System.out.println("Return boat: "+boat);
        availableBoats.add(boat);
        System.out.println("Availables boats:");
        System.out.println(availableBoats);
    }
}
