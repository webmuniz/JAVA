package academy.devdojo.maratonajava.javacore.lambdas.test;

import java.util.List;
import java.util.function.Consumer;

/**
 * Lambdas precisam que seja de uma interface funcional - apenas um método;
 * Predicate | Consumer
 */

public class LambdasTest01 {
    public static void main(String[] args) {
        List<String> names = List.of("webmuniz", "William", "Suane", "Bryan");
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        forEach(names, s -> System.out.println(s));
        forEach(integers, i -> System.out.println(i));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }

    }
}
