package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {

        Calculadora calc1 = new Calculadora();
        double result = calc1.divisao(20,3);
        System.out.println(result);
    }
}
