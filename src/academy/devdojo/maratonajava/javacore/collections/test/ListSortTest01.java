package academy.devdojo.maratonajava.javacore.collections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Attack on Titan");
        mangas.add("Demon Slayer");
        mangas.add("Dragon ball Z");
        mangas.add("Pokemon");

        Collections.sort(mangas);

        for (String manga : mangas) {
            System.out.println(manga);
        }

        List<Double> prices = new ArrayList<>(6);
        prices.add(100.21);
        prices.add(13.58);
        prices.add(724.33);
        prices.add(17.70);
        prices.add(344.75);

        Collections.sort(prices);
        System.out.println("Price: "+prices);
    }
}
