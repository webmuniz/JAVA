package academy.devdojo.maratonajava.javacore.collections.test;

import academy.devdojo.maratonajava.javacore.collections.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(5L, "Attack on Titan", 13.99, 0));
        mangas.add(new Manga(1L,"Demon Slayer", 8.99, 5));
        mangas.add(new Manga(4L,"Dragon ball Z", 20.00, 3));
        mangas.add(new Manga(3L,"Pokemon", 7.00, 2));
        mangas.add(new Manga(2L,"DeathNote", 15.00, 0));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()){
//            Manga next = mangaIterator.next();
//            if (next.getQuantity() == 0){
//                mangaIterator.remove();
//            }
//        }
        //functional
        mangas.removeIf(manga -> manga.getQuantity() == 0);
        System.out.println(mangas);
    }
}
