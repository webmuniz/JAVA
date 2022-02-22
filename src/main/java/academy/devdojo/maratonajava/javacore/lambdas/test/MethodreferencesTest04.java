package academy.devdojo.maratonajava.javacore.lambdas.test;

import academy.devdojo.maratonajava.javacore.lambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

//Reference to a constructor
public class MethodreferencesTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparator = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparator.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One Peace", 1000), new Anime("Naruto", 500)));

        animeList.sort(animeComparators::compareByEpisodeNonStatic);
        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title, episodes); //Forma 1
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new; // Forma 2

        System.out.println(animeBiFunction2.apply("Super Campeões", 36));
    }
}
