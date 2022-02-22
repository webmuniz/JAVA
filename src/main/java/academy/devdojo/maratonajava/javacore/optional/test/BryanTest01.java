package academy.devdojo.maratonajava.javacore.optional.test;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class BryanTest01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Red", "Green", "Blue", "Gray", "black");
        List<String> filteredList = list.stream().filter(entry -> entry.toLowerCase().startsWith("b")).collect(Collectors.toList());
        System.out.println(filteredList);
    }
}
