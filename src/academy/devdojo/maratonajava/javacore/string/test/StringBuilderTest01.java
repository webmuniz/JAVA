package academy.devdojo.maratonajava.javacore.string.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String name = "Elvis Muniz";

        StringBuilder sb = new StringBuilder(name);
        sb.append(" - DevDojo").append(" Academy");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse(); //Reverte a reversão anterior
        sb.delete(5, 11); //Deletei o "Muniz"
        System.out.println(sb);

        //Tudo que foi feito acima serve para StringBuffer tambem;
    }
}
