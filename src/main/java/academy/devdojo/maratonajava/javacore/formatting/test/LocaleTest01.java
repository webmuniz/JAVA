package academy.devdojo.maratonajava.javacore.formatting.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeBR = new Locale("pt", "BR");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapan = new Locale("ja", "JP");
        Locale localeNetherlands = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeBR);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat df6 = DateFormat.getDateInstance(DateFormat.FULL, localeNetherlands);

        System.out.println("Italy: "+ df1.format(calendar.getTime()));
        System.out.println("Switzerland: "+ df2.format(calendar.getTime()));
        System.out.println("Brazil: "+ df3.format(calendar.getTime()));
        System.out.println("India: "+ df4.format(calendar.getTime()));
        System.out.println("Japan: "+ df5.format(calendar.getTime()));
        System.out.println("Netherlands: "+ df6.format(calendar.getTime()));

        System.out.println("===================================");

        //Show country name in dif. languages:
        System.out.println(localeBR.getDisplayCountry()); //Default JVM
        System.out.println(localeCH.getDisplayCountry());
        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeIndia.getDisplayCountry());
        System.out.println(localeJapan.getDisplayCountry());
        System.out.println(localeNetherlands.getDisplayCountry());

        System.out.println("---------- in japanese");
        System.out.println(localeBR.getDisplayCountry(localeJapan));
        System.out.println(localeCH.getDisplayCountry(localeJapan));
        System.out.println(localeItaly.getDisplayCountry(localeJapan));
        System.out.println(localeIndia.getDisplayCountry(localeJapan));
        System.out.println(localeJapan.getDisplayCountry(localeJapan));
        System.out.println(localeNetherlands.getDisplayCountry(localeJapan));

        System.out.println("---------- in italian");
        System.out.println(localeBR.getDisplayCountry(localeItaly));
        System.out.println(localeCH.getDisplayCountry(localeItaly));
        System.out.println(localeItaly.getDisplayCountry(localeItaly));
        System.out.println(localeIndia.getDisplayCountry(localeItaly));
        System.out.println(localeJapan.getDisplayCountry(localeItaly));
        System.out.println(localeNetherlands.getDisplayCountry(localeItaly));
    }
}
