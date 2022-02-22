package academy.devdojo.maratonajava.javacore.streams.test;

import academy.devdojo.maratonajava.javacore.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Death Note", 3.99),
            new LightNovel("Dragon Ball", 2.59),
            new LightNovel("Demon Slayer", 5.89),
            new LightNovel("Demon Slayer", 5.89),
            new LightNovel("Pokemon", 6.50),
            new LightNovel("Fullmetal alchemist", 5.99),
            new LightNovel("Monogatari", 4.99),
            new LightNovel("Overlord", 8.99)
    ));

    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.forEach(System.out::println);
        long count = stream
                .distinct()
                .filter(ln -> ln.getPrice() <= 6)
                .count(); //Once the stream is closed, it needs to be opened again, as shown below.

        //long count2 = lightNovels.stream().distinct().filter(ln -> ln.getPrice() <= 6).count();

        System.out.println(count + " LightNovels costing less than $ 6.00");
        //System.out.println(count2 + " LightNovels costing less than $ 6.00 (not included repeated)");
    }
}
