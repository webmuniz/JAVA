package academy.devdojo.maratonajava.introduction;

public class A05ConditionalStructuresExercises {
    public static void main(String[] args) {

        double salarioAnual = 25000;
        double primeiraFaixa = 9.78 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.58 / 100;
        double valorImposto;

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68587) {
            valorImposto = salarioAnual * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }

        System.out.println("Ganhando "+salarioAnual+" por ano, vocâ paga de imposto: "+valorImposto);
    }
}
