package academy.devdojo.maratonajava.javacore.collections.test;

import academy.devdojo.maratonajava.javacore.collections.domain.Consumer;
import academy.devdojo.maratonajava.javacore.collections.domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("ELvis Muniz");
        Consumer consumer2 = new Consumer("William Suane");

        Manga manga1 = new Manga(5L, "Attack on Titan", 13.99);
        Manga manga2 = new Manga(1L, "Demon Slayer", 8.99);
        Manga manga3 = new Manga(4L, "Dragon ball Z", 20.00);
        Manga manga4 = new Manga(3L, "Pokemon", 7.00);
        Manga manga5 = new Manga(2L, "DeathNote", 15.00);

        Map<Consumer, Manga> consumerManga = new HashMap<>();
        consumerManga.put(consumer1, manga1);
        consumerManga.put(consumer2, manga4);

        for (Map.Entry<Consumer, Manga> entry : consumerManga.entrySet()) {
            System.out.println(entry.getKey().getName() + " comprou " + entry.getValue().getName() + " por " + entry.getValue().getPrice());
        }
    }
}
