package academy.devdojo.maratonajava.javacore.collections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(0);
        numbers.add(4);
        numbers.add(3);

        //if not find:
        //(-(insertion point)-1
        Collections.sort(numbers);
        System.out.println(Collections.binarySearch(numbers, 1)); //return: (-(insertion point)-1
    }
}
