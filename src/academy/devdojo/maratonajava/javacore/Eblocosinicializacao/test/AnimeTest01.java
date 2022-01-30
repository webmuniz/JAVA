package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime1 = new Anime(); //Chama construtor sem argumentos
        Anime anime2 = new Anime("One Peace"); //Chama construtor com argumento nome;

        for (int episodio : anime1.getEpisodios()) {
            System.out.print(episodio + " ");
        }


    }
}
