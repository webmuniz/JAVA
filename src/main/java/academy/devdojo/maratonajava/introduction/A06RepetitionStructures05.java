package academy.devdojo.maratonajava.introduction;

public class A06RepetitionStructures05 {
    public static void main(String[] args) {

        double valorCarro = 30000;

        for (int parcela = (int) valorCarro; parcela >= 1; parcela--) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000){
                continue; //Ou seja, pula o próximo passo (linha 13) e começa um novo laço!
            }
            System.out.println(parcela + "x de R$" + valorParcela);
        }
    }
}
