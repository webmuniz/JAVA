package academy.devdojo.maratonajava.javacore.introductionmethods.dominio;

public class Calculadora {

    public void soma() {
        System.out.println(10 + 10);
    }

    public void subtracao() {
        System.out.println(21 - 2);
    }

    public void multiplicacao(int n1, int n2) {
        System.out.println(n1 * n2);
    }

    public double divisao(double n1, double n2) {
        if (n2 == 0) {
            return 0;
        }
        return n1 / n2; //Como o retorno não é void ele precisa ser declarado com algum retorno
    }

    //Outra forma de fazer a lógica acima:

    public double divisao02(double n1, double n2) {
        if (n2 != 0) {
            return n1 / n2;
        }
        return 0;

    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    //Usando var args

    public void somaVarArgs(int... numeros) { //var args precisa ser o último caso queira declarar esperar outros argumentos
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

}
