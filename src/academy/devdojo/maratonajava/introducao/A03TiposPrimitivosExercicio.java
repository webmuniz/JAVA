package academy.devdojo.maratonajava.introducao;

/*
Prática

Crie Variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário <salario>, na data <data>
*/

public class A03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Elvis";
        String endereco = "Estrada do Moinho";
        float salario = 5635.26F;
        String dataRecebimento = "15/01/2022";

        System.out.println("Eu " + nome + ", morando no endereço " + endereco + ",\nconfirmo que recebi o salário de R$" + salario + ", na data " + dataRecebimento + ".");
    }
}
