package academy.devdojo.maratonajava.javacore.streams.test;

import academy.devdojo.maratonajava.javacore.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamTest06 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Death Note", 3.99),
            new LightNovel("Dragon Ball", 2.59),
            new LightNovel("Demon Slayer", 5.89),
            new LightNovel("Pokemon", 6.50),
            new LightNovel("Fullmetal alchemist", 5.99),
            new LightNovel("Monogatari", 4.99),
            new LightNovel("Overlord", 8.99)
    ));

    public static void main(String[] args) {
        System.out.println(lightNovels.stream().anyMatch(lightNovel -> lightNovel.getPrice() > 9)); //do any light novels cost more than 9?
        System.out.println(lightNovels.stream().allMatch(lightNovel -> lightNovel.getPrice() > 0)); // do ALL light novels cost more than zero?
        System.out.println(lightNovels.stream().noneMatch(lightNovel -> lightNovel.getPrice() > 0)); // no light novels cost more than zero?

        lightNovels.stream()
                .filter(lightNovel -> lightNovel.getPrice() > 4)
                .findAny()
                .ifPresent(System.out::println); //findAny - return any light novel

        lightNovels.stream()
                .filter(ln->ln.getPrice() > 6)
                .sorted(Comparator.comparing(LightNovel::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);//findFirst - return first light novel

        lightNovels.stream()
                .filter(ln->ln.getPrice() > 6)
                .max(Comparator.comparing(LightNovel::getPrice).reversed())
                .ifPresent(System.out::println);//findFirst - return first light novel WITHOUT SORTED!
    }
}
