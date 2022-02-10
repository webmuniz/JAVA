package academy.devdojo.maratonajava.javacore.collections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConvertTest01 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        Integer[] toArray = numbers.toArray(new Integer[0]);
        System.out.println("List to Array: "+Arrays.toString(toArray));

        Integer[] numbersArray = new Integer[3];
        numbersArray[0] = 1;
        numbersArray[1] = 2;
        numbersArray[2] = 3;

        List<Integer> toList = Arrays.asList(numbersArray);

        toList.set(0,12); //position 0, value 12

        System.out.println("Array to List: "+toList);

        System.out.println("-------------");
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(numbersArray));
        numbersList.add(15);
        System.out.println(numbersList);

        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
        List.of("1", "2");

    }
}
