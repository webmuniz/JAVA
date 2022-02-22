package academy.devdojo.maratonajava.javacore.streams.test;

import academy.devdojo.maratonajava.javacore.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectorsTest01 {

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
        System.out.println(lightNovels.stream().count()); //count
        System.out.println(lightNovels.stream().collect(Collectors.counting())); //count using Collectors

        System.out.println("------------");

        lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println); //Max price
        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println); //Max price with Collectors

        System.out.println("------------");

        System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).sum()); //sum
        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice))); //sum with Collectors

        System.out.println("------ ONE WAY! ------");

        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);

        String titles = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);
    }
}
