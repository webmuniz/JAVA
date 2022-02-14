package academy.devdojo.maratonajava.javacore.lambdas.test;

import academy.devdojo.maratonajava.javacore.lambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

//
public class MethodReferencesTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One Peace", 1000), new Anime("Naruto", 500)));
        animeList.sort(animeComparators::compareByEpisodeNonStatic);
        System.out.println(animeList);
    }
}
