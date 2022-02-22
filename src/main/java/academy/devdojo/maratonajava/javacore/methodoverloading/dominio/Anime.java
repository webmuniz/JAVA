package academy.devdojo.maratonajava.javacore.methodoverloading.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    //Sobrecarga de métodos com o mesmo nome mas acrescentando parâmetros! (Não podem ser iguais)

    public void init(String nome, String tipo, int episodios, String genero){
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }

    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Tipo: "+this.tipo);
        System.out.println("Episódios: "+this.episodios);
        System.out.println("Gênero: "+this.genero);
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
