package academy.devdojo.maratonajava.javacore.streams.test;

import java.util.List;

public class StreamTest07 {
    public static void main(String[] args) {
        final List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);

        System.out.println("sum:");
        integers.stream().reduce((x, y) -> x + y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0, Integer::sum));

        System.out.println("multiplication:");
        integers.stream().reduce((x, y) -> x * y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(1, (x, y) -> x * y));

        System.out.println("higher number:");
        integers.stream().reduce((x, y) -> x > y ? x : y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0, Integer::max));
    }
}
