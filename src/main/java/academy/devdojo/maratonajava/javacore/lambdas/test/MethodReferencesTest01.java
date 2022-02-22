package academy.devdojo.maratonajava.javacore.lambdas.test;

import academy.devdojo.maratonajava.javacore.lambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

//Reference to a static method:
public class MethodReferencesTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One Peace", 1000), new Anime("Naruto", 500)));
        //Collections.sort(animeList, Comparator.comparing(Anime::getTitle));
        //Collections.sort(animeList, (a1, a2) -> AnimeComparators.compareByTitle(a1, a2));
        //Collections.sort(animeList, AnimeComparators::compareByTitle);
        animeList.sort(AnimeComparators::compareByEpisode);
        System.out.println(animeList);
    }
}
