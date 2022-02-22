package academy.devdojo.maratonajava.javacore.lambdas.service;

import academy.devdojo.maratonajava.javacore.lambdas.domain.Anime;

public class AnimeComparators {
    public static int compareByTitle(Anime a1, Anime a2){
        return a1.getTitle().compareTo(a2.getTitle());
    }
    public static int compareByEpisode(Anime a1, Anime a2){
        return a1.getEpisodes().compareTo(a2.getEpisodes());
    }

    public int compareByEpisodeNonStatic(Anime a1, Anime a2){
        return a1.getEpisodes().compareTo(a2.getEpisodes());
    }
}
