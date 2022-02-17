package academy.devdojo.maratonajava.javacore.streams.test;

import academy.devdojo.maratonajava.javacore.streams.domain.Category;
import academy.devdojo.maratonajava.javacore.streams.domain.LightNovel;
import academy.devdojo.maratonajava.javacore.streams.domain.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static academy.devdojo.maratonajava.javacore.streams.domain.Promotion.*;
import static java.util.stream.Collectors.groupingBy;

public class StreamCollectorsTest03 {

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

        //Group by promotion
        Map<Promotion, List<LightNovel>> collect = lightNovels.stream()
                .collect(groupingBy(ln -> (ln.getPrice() < 5) ? UNDER_PROMOTION : NORMAL_PRICE
                ));

        System.out.println(collect);

        //Group by promotion and category
        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels
                .stream()
                .collect(groupingBy(
                LightNovel::getCategory,
                groupingBy(ln -> (ln.getPrice() < 5) ? UNDER_PROMOTION : NORMAL_PRICE))
                );
        System.out.println(collect1);
    }
}
