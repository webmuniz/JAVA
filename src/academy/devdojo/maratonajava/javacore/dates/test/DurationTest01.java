package academy.devdojo.maratonajava.javacore.dates.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime afterTwoYears = LocalDateTime.now().plusYears(2).plusMinutes(8);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinusSevenHours = LocalTime.now().minusHours(7).minusMinutes(22);

        //Duration não trabalha com LocalDate porque não tem segundos - Usar Period
        Duration duration1 = Duration.between(now, afterTwoYears);
        System.out.println(duration1);

        Duration duration2 = Duration.between(timeNow, timeMinusSevenHours);
        System.out.println(duration2);

        Duration duration3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        System.out.println(duration3);

        Duration d1 = Duration.ofDays(20);
        Duration d2 = Duration.ofMinutes(3);
        Duration d3 = Duration.of(3, ChronoUnit.HOURS);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
