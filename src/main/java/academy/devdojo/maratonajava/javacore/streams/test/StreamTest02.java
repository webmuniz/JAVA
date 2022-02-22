package academy.devdojo.maratonajava.javacore.streams.test;

import academy.devdojo.maratonajava.javacore.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//1 . Order LightNovel by title
//2 . Retrieve the first 3 titles with price less than 4
public class StreamTest02 {

    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Death Note", 3.99),
            new LightNovel("Dragon Ball", 2.59),
            new LightNovel("Demon Slayer", 7.89),
            new LightNovel("Pokemon", 6.50),
            new LightNovel("Fullmetal alchemist", 5.99),
            new LightNovel("Monogatari", 4.99),
            new LightNovel("Overlord", 8.99)
    ));

    public static void main(String[] args) {
        List<String> titles = lightNovelList.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 6)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(titles);

    }
}
