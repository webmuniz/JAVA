package academy.devdojo.maratonajava.javacore.constructor.test;


import academy.devdojo.maratonajava.javacore.constructor.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "Mangá", 22, "Terror", "PUBG");
        anime.imprime();
    }
}
