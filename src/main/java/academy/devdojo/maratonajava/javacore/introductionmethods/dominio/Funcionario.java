package academy.devdojo.maratonajava.javacore.introductionmethods.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void mediaSalarios() {
        if (salarios == null){
            return;
        }
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Média salarial: " + media);
    }

    public void imprime() {
        System.out.println("=-=-=-=-=-=-==-=-=-=-=-=-=");
        System.out.println("Funcionário: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("--------");
        if (salarios != null) {
            for (double salario : salarios) {
                System.out.print(salario + " | ");
            }
            mediaSalarios();
        }
        System.out.println("\n=-=-=-=-=-=-==-=-=-=-=-=-=");
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}
