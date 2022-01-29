package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fusca";
        carro1.modelo = "Sport";
        carro1.ano = 1969;

        carro2.nome = "Gol";
        carro2.modelo = "HighLine";
        carro2.ano = 2014;

        System.out.println("Nome: " + carro1.nome + " | Modelo: " + carro1.modelo + " | Ano: " + carro1.ano);
        System.out.println("---------------");
        System.out.println("Nome: " + carro2.nome + " | Modelo: " + carro2.modelo + " | Ano: " + carro2.ano);
    }
}
