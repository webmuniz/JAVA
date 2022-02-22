package academy.devdojo.maratonajava.javacore.collections.test;

import academy.devdojo.maratonajava.javacore.collections.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();

        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(5L, "Attack on Titan", 13.99));
        mangas.add(new Manga(1L,"Demon Slayer", 8.99));
        mangas.add(new Manga(4L,"Dragon ball Z", 20.00));
        mangas.add(new Manga(3L,"Pokemon", 7.00));
        mangas.add(new Manga(2L,"DeathNote", 15.00));

        //Collections.sort(mangas); //Compare is use name...
        mangas.sort(mangaByIdComparator);
        
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(2L,"DeathNote", 15.00);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));


    }
}
