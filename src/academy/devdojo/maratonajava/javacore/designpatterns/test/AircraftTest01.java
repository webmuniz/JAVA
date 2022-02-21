package academy.devdojo.maratonajava.javacore.designpatterns.test;

import academy.devdojo.maratonajava.javacore.designpatterns.domain.Aircraft;
import academy.devdojo.maratonajava.javacore.designpatterns.domain.AircraftSingletonEager;

public class AircraftTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
        AircraftTest01.bookSeat("1A");
    }

    static void bookSeat(String seat){
        System.out.println(AircraftSingletonEager.getINSTANCE());
        Aircraft aircraft = new Aircraft("Boeing 787");
        System.out.println(aircraft.bookSeat(seat));
    }
}
