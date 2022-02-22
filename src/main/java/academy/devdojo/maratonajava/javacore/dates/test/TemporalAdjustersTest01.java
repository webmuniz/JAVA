package academy.devdojo.maratonajava.javacore.dates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        System.out.println("Hoje: " + now);
        System.out.println(now.getDayOfWeek());

        System.out.println("----------");

        now = now.withDayOfMonth(21); //Quero que seja dia 21 do mês
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("----------");

        now = now.withMonth(4); //Quero que o mês seja abril
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("----------");

        now = now.with(ChronoField.DAY_OF_MONTH, 23); //Quero que seja dia 23
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("----------");

        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY)); //No dia ou o proximo que será 'MONDAY'(segunda)
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY)); //No proximo que será 'THURSDAY' (quinta))
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.MONDAY)); //No último dia que foi 'MONDAY'(segunda)
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("----------");

        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()); //O ultimo dia do mês
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth()); //O primeiro dia do mês
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("----------");

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

    }
}
