package academy.devdojo.maratonajava.javacore.dates.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now); //Zulu Time - mesma hora no mundo;
        System.out.println(LocalDateTime.now());

        System.out.println(now.getEpochSecond()); //long
        System.out.println(now.getNano()); //nano segundo do segundo 999.999.999
        System.out.println(Instant.ofEpochSecond(3)); //3 segundos de 1970
        System.out.println(Instant.ofEpochSecond(3, 1_000_000));
        System.out.println(Instant.ofEpochSecond(3, -1_000_000));
    }
}
