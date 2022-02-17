package academy.devdojo.maratonajava.javacore.streams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

/*
 * - Benchmark
 * - Unboxing | boxing
 * - (limit, findFirst)(findAny)
 * - Total coust of computation N, P
 * - data quantity
 * - Type of collections
 * - Size of stream (defined size)
 * - Process merge
 *
 * if (task is small and cannot be divided)
 * do sequentially
 * else{
 * divide into 2 tasks
 * call the same method recursively
 * waits for all tasks to be completed
 * combine the result
 */

public class StreamParallelTest01 {
    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 1_000_000;

        sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);
        sumLongStreamIterate(num);
        sumParallelLongStreamIterate(num);
    }

    private static void sumFor(long num) {
        System.out.println("--------\nSum for:");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i <= num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init)+" ms");
    }

    private static void sumStreamIterate(long num) {
        System.out.println("--------\nSum StreamIterate:");
        long result = 0;
        long init = System.currentTimeMillis();
        result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init)+" ms");
    }

    private static void sumParallelStreamIterate(long num) {
        System.out.println("--------\nSum ParallelStreamIterate:");
        long result = 0;
        long init = System.currentTimeMillis();
        result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init)+" ms");
    }

    private static void sumLongStreamIterate(long num) {
        System.out.println("--------\nSum LongStreamIterate:");
        long result = 0;
        long init = System.currentTimeMillis();
        result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init)+" ms");
    }

    private static void sumParallelLongStreamIterate(long num) {
        System.out.println("--------\nSum ParallelLongStreamIterate:");
        long result = 0;
        long init = System.currentTimeMillis();
        result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init)+" ms");
    }
}
