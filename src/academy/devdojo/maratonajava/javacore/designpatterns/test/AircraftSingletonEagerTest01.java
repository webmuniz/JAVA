package academy.devdojo.maratonajava.javacore.designpatterns.test;

import academy.devdojo.maratonajava.javacore.designpatterns.domain.Aircraft;
import academy.devdojo.maratonajava.javacore.designpatterns.domain.AircraftSingletonEager;

public class AircraftSingletonEagerTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonEager.getINSTANCE());
        AircraftSingletonEager aircraftSingletonEager = AircraftSingletonEager.getINSTANCE();
        System.out.println(aircraftSingletonEager.bookSeat(seat));
    }
}
