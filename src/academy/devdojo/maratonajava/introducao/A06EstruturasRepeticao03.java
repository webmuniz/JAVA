package academy.devdojo.maratonajava.introducao;

public class A06EstruturasRepeticao03 {
    public static void main(String[] args) {

        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25) {
                break;
            }
            System.out.println("i = " + i);
        }

    }
}
