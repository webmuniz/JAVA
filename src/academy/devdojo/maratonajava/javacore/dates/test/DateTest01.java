package academy.devdojo.maratonajava.javacore.dates.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1644071356924L); // long em ms desde 01/01/1970
        System.out.println(date);
        date.setTime(date.getTime()+ 3_600_000); //Acrescenta 1 hora
        System.out.println(date);

    }
}
