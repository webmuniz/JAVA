package academy.devdojo.maratonajava.javacore.streams.test;

import academy.devdojo.maratonajava.javacore.streams.domain.Category;
import academy.devdojo.maratonajava.javacore.streams.domain.LightNovel;
import academy.devdojo.maratonajava.javacore.streams.domain.Promotion;

import java.util.*;

import static academy.devdojo.maratonajava.javacore.streams.domain.Promotion.*;
import static java.util.stream.Collectors.*;

public class StreamCollectorsTest05 {

    private static final List<LightNovel> lightNovels = new ArrayList<>(List.of(
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

        //Metrics by category:
        final Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(groupingBy(
                        LightNovel::getCategory,
                        summarizingDouble(LightNovel::getPrice
                        )));
        System.out.println(collect);

        final Map<Category, Set<Promotion>> collect1 = lightNovels.stream()
                .collect(groupingBy(
                        LightNovel::getCategory,
                        mapping(
                                StreamCollectorsTest05::getPromotion,
                                toSet()
                        )));
        System.out.println("---------\n" + collect1);

        final Map<Category, LinkedHashSet<Promotion>> collect2 = lightNovels.stream()
                .collect(groupingBy(
                        LightNovel::getCategory,
                        mapping(
                                StreamCollectorsTest05::getPromotion,
                                toCollection(LinkedHashSet::new)
                        )));
        System.out.println(collect2);
    }
    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 5 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}
