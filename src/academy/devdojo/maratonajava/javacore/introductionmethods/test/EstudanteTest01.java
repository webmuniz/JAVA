package academy.devdojo.maratonajava.javacore.introductionmethods.test;

import academy.devdojo.maratonajava.javacore.introductionmethods.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.introductionmethods.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Brucius";
        estudante01.idade = 31;
        estudante01.sexo = 'M';

        estudante02.nome = "Leprechaum";
        estudante02.idade = 131;
        estudante02.sexo = 'M';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
