package academy.devdojo.maratonajava.javacore.modificadorestatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    //modificador static faz o atributo pertencer à classe toda;
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime() {
        System.out.println("=-=-=-=-=-=-=-");
        System.out.println("Nome: " + this.nome);
        System.out.println("Vel. Máxima: " + this.velocidadeMaxima);
        System.out.println("vel. Limite: " + Carro.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
