package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.nome = "Elvis";
        funcionario1.idade = 30;
        funcionario1.salarios = new double[]{1200, 987.32, 2000};
        funcionario1.imprime();
    }
}
