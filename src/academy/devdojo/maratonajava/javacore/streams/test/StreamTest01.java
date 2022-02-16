package academy.devdojo.maratonajava.javacore.streams.test;

import academy.devdojo.maratonajava.javacore.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//1 . Order LightNovel by title
//2 . Retrieve the first 3 titles with price less than 4
public class StreamTest01 {

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
        lightNovelList.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovelList) {
            if (lightNovel.getPrice() <= 6 ){
                titles.add(lightNovel.getTitle());
            }
            if (titles.size() >=3){
                break;
            }
        }
        System.out.println(titles);

    }
}
