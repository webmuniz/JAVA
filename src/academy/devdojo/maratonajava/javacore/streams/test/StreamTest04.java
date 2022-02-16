package academy.devdojo.maratonajava.javacore.streams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {

        List<List<String>> devDojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Designer1","Designer2", "Designer3");
        List<String> developers = List.of("Developer1","Developer2", "Developer3");
        List<String> students = List.of("Student1","Student2", "Student3");

        devDojo.add(graphicDesigners);
        devDojo.add(developers);
        devDojo.add(students);

        for (List<String> people : devDojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }

        System.out.println("-------- MESMO RESULTADO ------");
        devDojo.stream().flatMap(Collection::stream).forEach(System.out::println);

    }
}
