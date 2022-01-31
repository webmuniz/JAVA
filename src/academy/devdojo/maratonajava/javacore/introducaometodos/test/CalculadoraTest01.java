package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calc1 = new Calculadora();
        calc1.soma();
        calc1.subtracao();
        calc1.multiplicacao(10, 20);
    }
}
