package academy.devdojo.maratonajava.javacore.innerclasses.test;

public class OuterClassesTest01 {
    private String name = "Midoriya";

    void print(String param) {
        final String lastName = "Izuku";
        class LocalClass {
            public void printLocal() {
                System.out.println(name +" "+ lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest01 outer = new OuterClassesTest01();
        outer.print("param");
    }
}
