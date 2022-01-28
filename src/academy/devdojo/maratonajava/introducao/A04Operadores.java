package academy.devdojo.maratonajava.introducao;

public class A04Operadores {
    public static void main(String[] args) {

        // + - * /
        int n1 = 10;
        int n2 = 20;

        int soma = n1 + n2;
        int multiplicacao = n1 * n2;
        int subtracao = n1 - n2;
        double divisao = n1 / (double) n2;

//        System.out.println(soma);
//        System.out.println(multiplicacao);
//        System.out.println(subtracao);
//        System.out.println(divisao);

        // %
        int resto = 20 % 2;
//        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorVinte = 10 > 20;
        boolean isDezMenorVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferentelDez = 10 != 10;

//        System.out.println(isDezMaiorVinte);
//        System.out.println(isDezMenorVinte);
//        System.out.println(isDezIgualVinte);
//        System.out.println(isDezIgualDez);
//        System.out.println(isDezDiferentelDez);

        // && (AND)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroLeiMaiorTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroLeiMenorTrinta = idade < 30 && salario >= 3381;

//        System.out.println(isDentroLeiMaiorTrinta);
//        System.out.println(isDentroLeiMenorTrinta);

        // OR ||
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;

        float valorPlaystation = 5000F;

        boolean isPlaystationCinco = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

//        System.out.println(isPlaystationCinco);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; //2800
        bonus -= 1000; //1800
        bonus *= 2; //3600
        bonus /= 2;
        bonus %= 2;

//        System.out.println(bonus);

        //
        int contador = 0;
        contador += 1;
        contador ++;
        contador --;
        ++contador;
        --contador;
        
        System.out.println(contador);

    }
}
