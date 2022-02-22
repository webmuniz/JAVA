package academy.devdojo.maratonajava.javacore.streams.test;

import academy.devdojo.maratonajava.javacore.streams.domain.Category;
import academy.devdojo.maratonajava.javacore.streams.domain.LightNovel;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class StreamCollectorsTest04 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Death Note", 3.99, Category.DRAMA),
            new LightNovel("Dragon Ball", 2.59, Category.FANTASY),
            new LightNovel("Demon Slayer", 5.89, Category.ROMANCE),
            new LightNovel("Demon Slayer", 5.89, Category.ROMANCE),
            new LightNovel("Pokemon", 6.50, Category.DRAMA),
            new LightNovel("Fullmetal alchemist", 5.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.99, Category.DRAMA),
            new LightNovel("Overlord", 8.99, Category.FANTASY)
    ));

    public static void main(String[] args) {

        //Count by category
        final Map<Category, Long> collect = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        //Highest price of each type:
        final Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream()
                .collect(
                        groupingBy(
                                LightNovel::getCategory,
                                Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))
                        ));

        System.out.println(collect1);
        final Map<Category, LightNovel> collect2 = lightNovels.stream()
                .collect(
                        groupingBy(
                                LightNovel::getCategory,
                                Collectors.collectingAndThen(
                                        Collectors.maxBy(
                                                Comparator.comparing(LightNovel::getPrice)),
                                        Optional::get
                                )));
        System.out.println(collect2);

        final Map<Category, LightNovel> collect3 = lightNovels.stream()
                .collect(
                        Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect3);
    }
}
