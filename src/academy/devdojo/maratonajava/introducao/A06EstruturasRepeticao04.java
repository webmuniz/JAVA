package academy.devdojo.maratonajava.introducao;

public class A06EstruturasRepeticao04 {

    //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
    //Valor da parcela >= 1000,00
    public static void main(String[] args) {

        double valorCarro = 30000;

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println(parcela + "x de R$" + valorParcela);
        }

    }
}
