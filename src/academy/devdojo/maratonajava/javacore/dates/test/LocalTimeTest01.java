package academy.devdojo.maratonajava.javacore.dates.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 32, 12);
        LocalTime timeNow = LocalTime.now();

        System.out.println(time);
        System.out.println(timeNow);

        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());

        System.out.println("ChronoField: " + time.get(ChronoField.HOUR_OF_DAY));
        System.out.println("ChronoField: " + timeNow.get(ChronoField.HOUR_OF_DAY));

        System.out.println(timeNow.getHour());
        System.out.println(timeNow.getMinute());
        System.out.println(timeNow.getSecond());

        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}
