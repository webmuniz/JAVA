package academy.devdojo.maratonajava.javacore.regex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String text = "Levi, Eren, Mikasa, true, 200";
        String[] names = text.split(",");
        for (String name : names) {
            System.out.println(name.trim());
        }
    }
}
