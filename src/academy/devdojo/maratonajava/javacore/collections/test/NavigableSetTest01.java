package academy.devdojo.maratonajava.javacore.collections.test;

import academy.devdojo.maratonajava.javacore.collections.domain.Manga;
import academy.devdojo.maratonajava.javacore.collections.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneBrandComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}

class MangaPriceComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {

        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneBrandComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);


        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPriceComparator());
        mangas.add(new Manga(5L, "Attack on Titan", 13.99, 0));
        mangas.add(new Manga(1L,"Demon Slayer", 8.99, 5));
        mangas.add(new Manga(4L,"Dragon ball Z", 20.00, 3));
        mangas.add(new Manga(3L,"Pokemon", 7.00, 2));
        mangas.add(new Manga(2L,"DeathNote", 15.00, 0));

        for (Manga manga : mangas.descendingSet()) { //.descendingSet() - ordem contrária
            System.out.println(manga);
        }
        System.out.println("==============");
        //lower <
        //floor <=
        // higher >
        // ceiling >=
        Manga yuyu = new Manga(21L, "Yuyu Hakusho", 8, 5);

        System.out.println(mangas.lower(yuyu)); // menor preço antes do 8 é do pokemon 7;
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));
        System.out.println("================");
        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());



    }
}
