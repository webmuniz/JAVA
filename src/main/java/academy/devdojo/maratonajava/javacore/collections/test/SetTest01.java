package academy.devdojo.maratonajava.javacore.collections.test;

import academy.devdojo.maratonajava.javacore.collections.domain.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        //Set<Manga> mangas = new HashSet<>(); //sort by hash
        Set<Manga> mangas = new LinkedHashSet<>(); //sort by insertion

        mangas.add(new Manga(5L, "Attack on Titan", 13.99, 0));
        mangas.add(new Manga(1L,"Demon Slayer", 8.99, 5));
        mangas.add(new Manga(4L,"Dragon ball Z", 20.00, 3));
        mangas.add(new Manga(3L,"Pokemon", 7.00, 2));
        mangas.add(new Manga(2L,"DeathNote", 15.00, 0));
        mangas.add(new Manga(2L,"DeathNote", 15.00, 0)); //if duplicated HashSet ignore!

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
