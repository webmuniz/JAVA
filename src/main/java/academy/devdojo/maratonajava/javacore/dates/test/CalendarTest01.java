package academy.devdojo.maratonajava.javacore.dates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Hoje é dia de... ESTUDAR!");
        }

        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        calendar.add(Calendar.DAY_OF_MONTH, 2); //Acrescenta 2 dias ao dia do mês atual
        calendar.add(Calendar.HOUR, 2); //Acrescenta 2 horas - Capaz de virar o dia/mês/ano
        calendar.roll(Calendar.HOUR, 2); //Acrescenta 2 horas - INCAPAZ de virar o dia/mês/ano - recomeça o dia

        Date date = calendar.getTime();
        System.out.println(date);
    }
}
