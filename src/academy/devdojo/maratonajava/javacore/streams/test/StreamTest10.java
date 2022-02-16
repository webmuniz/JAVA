package academy.devdojo.maratonajava.javacore.streams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args) {

        //pair numbers
        Stream.iterate(0, n -> n + 2).limit(10).forEach(System.out::println);

        //Fibonacci
        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .forEach(a -> System.out.println(Arrays.toString(a)));

        //Only numbers Fibonacci:
        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(a-> a[0])
                .forEach(System.out::println);

        System.out.println("==================================================");

        //15 Random numbers 1-100
        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(1,100))
                .limit(15)
                .forEach(System.out::println);
    }
}
