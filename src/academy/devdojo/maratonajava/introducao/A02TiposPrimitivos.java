package academy.devdojo.maratonajava.introducao;

public class A02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int idade = 100;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.5;
        float salarioFloat = 2500.6F; //Colocar F para identificar um float
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractereAsc = 65; //ASCII
        char caractereUni = '\u0041'; //Unicode

        System.out.println("A idade é: " + idade + " anos");
        System.out.println(numeroGrande);
        System.out.println(salarioDouble);
        System.out.println(salarioFloat);
        System.out.println(idadeByte);
        System.out.println(idadeShort);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(caractereAsc);
        System.out.println(caractereUni);

    }
}
