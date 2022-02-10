package academy.devdojo.maratonajava.introducao;

public class A07Arrays02 {
    public static void main(String[] args) {

        // DE DEFAULT QUANDO O ARRAY ESTÁ VAZIO:
        // byte, long, int, short, float e double -> 0
        // char '\u0000' = espaço em branco
        // boolean false
        // String null

        String[] nomes = new String[4];
        nomes[0]= "Goku";
        nomes[1]= "Vegeta";
        nomes[2]= "Kuririm";
        nomes[3]= "Elvis";

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

    }
}
