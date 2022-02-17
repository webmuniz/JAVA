package academy.devdojo.maratonajava.javacore.streams.test;

import academy.devdojo.maratonajava.javacore.streams.domain.Category;
import academy.devdojo.maratonajava.javacore.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectorsTest02 {

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

        Map<Category, List<LightNovel>> categoryLightNovelMap = new HashMap<>();

        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCategory()){
                case DRAMA: drama.add(lightNovel); break;
                case FANTASY: fantasy.add(lightNovel); break;
                case ROMANCE: romance.add(lightNovel); break;
            }
        }

        categoryLightNovelMap.put(Category.DRAMA, drama);
        categoryLightNovelMap.put(Category.FANTASY, fantasy);
        categoryLightNovelMap.put(Category.ROMANCE, romance);

        System.out.println(categoryLightNovelMap);


        //SAME FUNCTION USING STREAM:

        Map<Category, List<LightNovel>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);

    }
}
