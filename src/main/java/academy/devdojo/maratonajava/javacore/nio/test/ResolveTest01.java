package academy.devdojo.maratonajava.javacore.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/elvis");//NO starting with '/' he starts at the root of the project.
        Path file = Paths.get("dev/file.txt");
        Path resolve = dir.resolve(file);
        System.out.println(resolve);

        //Can be resolved from absolute to relative, not vice versa
    }
}
