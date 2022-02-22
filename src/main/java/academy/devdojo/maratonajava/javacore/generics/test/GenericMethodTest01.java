package academy.devdojo.maratonajava.javacore.generics.test;

import academy.devdojo.maratonajava.javacore.generics.domain.Boat;

import java.util.List;

public class GenericMethodTest01 {
    public static void main(String[] args) {
        List<Boat> boats = createArray(new Boat("Canoa Marota"));
        System.out.println(boats);
    }

    private static <T> List<T> createArray(T t) { //antes do retorno: <T>, retorno: List<T>
        return List.of(t);
    }
}
