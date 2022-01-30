package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;

    /**
     * 1 - Alocado espaço em memória para o objeto;
     * 2 - Cada atributo de classe é criado e inicializado com valores default, ou atribuidas;
     * 3 - Bloco de inicialização de executado;
     * 4 - Construtor executado;
     */

    //Bloco de inicialização de instancia ou não estático:
    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int episodio : this.episodios) {
            System.out.print(episodio + " | ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
