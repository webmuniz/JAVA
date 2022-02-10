package academy.devdojo.maratonajava.javacore.collections.test;

import academy.devdojo.maratonajava.javacore.collections.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(5L, "Attack on Titan", 13.99));
        mangas.add(new Manga(1L,"Demon Slayer", 8.99));
        mangas.add(new Manga(4L,"Dragon ball Z", 20.00));
        mangas.add(new Manga(3L,"Pokemon", 7.00));
        mangas.add(new Manga(2L,"DeathNote", 15.00));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("=========By Name======");

        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("=========By Id======");

        //Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
