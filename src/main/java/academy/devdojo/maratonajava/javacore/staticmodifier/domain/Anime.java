package academy.devdojo.maratonajava.javacore.staticmodifier.domain;

public class Anime {
    private String nome;
    private static final int[] episodios;

    /**
     * 0 - Bloco de Inicialização é executado quando a JVM carregar a classe;
     * 1 - Alocado espaço em memória para o objeto;
     * 2 - Cada atributo de classe é criado e inicializado com valores default, ou atribuidas;
     * 3 - Bloco de inicialização de executado;
     * 4 - Construtor executado;
     */

    //Bloco de inicialização de instancia estático:  estático cria apenas uma vez que a classe é criada pela JVM
    static {
        System.out.println("Dentro do Bloco de Inicialização estático 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do Bloco de Inicialização estático 2");
    }

    static {
        System.out.println("Dentro do Bloco de Inicialização estático 3");
    }

    // Não estático cria toda vez que a classe é criada pela JVM
    {
        System.out.println("Dentro do Bloco de Inicialização NÃO estático 4");
    }


    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int episodio : Anime.episodios) {
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
