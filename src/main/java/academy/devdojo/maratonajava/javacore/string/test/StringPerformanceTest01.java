package academy.devdojo.maratonajava.javacore.string.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        concatString(4_000); //Underline não muda nada, ajuda no entendimento do número;
        long end = System.currentTimeMillis();
        System.out.println("Total time: " + (end - start) + "ms - PARA APENAS 4.000!");

        start = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        end = System.currentTimeMillis();
        System.out.println("Total time stringBuilder: " + (end - start) + "ms - PARA 1 MILHÃO!");

        start = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        end = System.currentTimeMillis();
        System.out.println("Total time stringBuffer: " + (end - start) + "ms - PARA 1 MILHÃO!");
    }

    //Método normal:
    private static void concatString(int length) {
        String text = "";
        for (int i = 0; i < length; i++) {
            text += i;
        }
    }

    //Com StringBuilder!
    private static void concatStringBuilder(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(i);
        }
    }

    //Com StringBuffer - Criado para ambientes multi thread
    private static void concatStringBuffer(int length) {
        StringBuffer sb2 = new StringBuffer(length);
        for (int i = 0; i < length; i++) {
            sb2.append(i);
        }
    }

}
