package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void mediaSalarios() {
        if (salarios == null){
            return;
        }
        double media = 0;
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

}
