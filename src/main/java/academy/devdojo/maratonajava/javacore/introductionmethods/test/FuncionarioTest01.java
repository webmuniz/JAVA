package academy.devdojo.maratonajava.javacore.introductionmethods.test;

import academy.devdojo.maratonajava.javacore.introductionmethods.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.setNome("Elvis");
        funcionario1.setIdade(30);
        funcionario1.setSalarios(new double[]{1200, 987.32, 2000});
        funcionario1.imprime();

        System.out.println("Média: "+funcionario1.getMedia());
    }
}
