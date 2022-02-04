package academy.devdojo.maratonajava.javacore.constructor.domain;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    //Usando o construtor abaixo, os parametros devem ser inserido nod parenteses
    //quando criamos o objeto em [Objeto objeto = new Object(...)]
    public Anime(String nome, String tipo, int episodios, String genero){
        this(); //Esse this precisa ser na primeira linha
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodios, String genero, String estudio){
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }

    //Sobrecarga de construtores, para que não seja obrigatorio preencher como acima
    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprime(){
        System.out.println("-*-*-*-*-*-*-*-");
        System.out.println("Nome: "+this.nome);
        System.out.println("Tipo: "+this.tipo);
        System.out.println("Episódios: "+this.episodios);
        System.out.println("Gênero: "+this.genero);
        System.out.println("Estudio: "+this.estudio);
        System.out.println("-*-*-*-*-*-*-*-");
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getGenero() {
        return genero;
    }

    public String getNome(){
        return this.nome;
    }

    public String getTipo(){
        return this.tipo;
    }

    public int getEpisodios() {
        return this.episodios;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
