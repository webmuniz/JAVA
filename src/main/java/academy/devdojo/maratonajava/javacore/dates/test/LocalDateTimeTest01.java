package academy.devdojo.maratonajava.javacore.dates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2022, Month.AUGUST, 6);
//      LocalDate date = LocalDate.parse("2022-08-06"); //O mesmo resultado que acima;
        LocalTime time = LocalTime.of(9, 45, 21);
//      LocalTime time = LocalTime.parse("09:45:00"); //O mesmo resutado que acima;

        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);

        LocalDateTime ldt1 = date.atTime(time); //"'date' na hora 'time'
        LocalDateTime ldt2 = time.atDate(date); //"'time' na data 'date'
        LocalDateTime ldt3 = date.atTime(12, 45, 22);
        System.out.println(ldt1);
        System.out.println(ldt2);
        System.out.println(ldt3);

    }
}
