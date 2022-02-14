package academy.devdojo.maratonajava.javacore.lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdasTest02 {
    public static void main(String[] args) {
        List<String> names = List.of("Goku", "Vegeta");
        List<Integer> integers = map(names, s -> s.length());
        List<String> map = map(names, s -> s.toUpperCase());
        System.out.println(integers);
        System.out.println(map);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
