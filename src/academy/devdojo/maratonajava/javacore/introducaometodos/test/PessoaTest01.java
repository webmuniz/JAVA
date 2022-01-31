package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Elvis");
        pessoa.setIdade(30);
        pessoa.imprime();

        // Imprimir dados em separado
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
