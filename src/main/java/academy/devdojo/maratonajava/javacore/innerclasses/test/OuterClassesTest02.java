package academy.devdojo.maratonajava.javacore.innerclasses.test;

public class OuterClassesTest02 {
    private String name = "webmuniz";

    static class Nested {
        private String lastName = "Git";

        void print() {
            System.out.println(new OuterClassesTest02().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
