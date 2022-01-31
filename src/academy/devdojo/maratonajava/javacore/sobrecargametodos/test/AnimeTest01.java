package academy.devdojo.maratonajava.javacore.sobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.sobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Demon Slayer", "TV", 25);
        anime.init("Akudama Drive", "NetFlix", 58, "Ação");
        anime.imprime();
    }
}
