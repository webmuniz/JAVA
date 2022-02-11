package academy.devdojo.maratonajava.javacore.collections.test;

import academy.devdojo.maratonajava.javacore.collections.domain.Consumer;
import academy.devdojo.maratonajava.javacore.collections.domain.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {

        Queue<Manga> mangaQueue = new PriorityQueue<>(new MangaPriceComparator());

        mangaQueue.add(new Manga(5L, "Attack on Titan", 13.99, 0));
        mangaQueue.add(new Manga(1L,"Demon Slayer", 8.99, 5));
        mangaQueue.add(new Manga(4L,"Dragon ball Z", 20.00, 3));
        mangaQueue.add(new Manga(3L,"Pokemon", 7.00, 2));
        mangaQueue.add(new Manga(2L,"DeathNote", 15.00, 0));

        while (!mangaQueue.isEmpty()){
            System.out.println(mangaQueue.poll());
        }
    }
}
