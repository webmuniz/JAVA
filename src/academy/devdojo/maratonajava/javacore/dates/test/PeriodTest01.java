package academy.devdojo.maratonajava.javacore.dates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.PriorityQueue;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate afterTwoYears = LocalDate.now().plusYears(2).plusWeeks(1).plusDays(3); //2 anos e 10 dias

        Period p1 = Period.between(now, afterTwoYears);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(3);
        Period p4 = Period.ofMonths(10);
        Period p5 = Period.ofYears(5);

        System.out.println("Period.between(now, afterTwoYears): " + p1);
        System.out.println("Period.ofDays(10): " + p2);
        System.out.println("Period.ofWeeks(3): " + p3);
        System.out.println("Period.ofMonths(10): " + p4);
        System.out.println("Period.ofYears(5): " + p5);
    }
}
