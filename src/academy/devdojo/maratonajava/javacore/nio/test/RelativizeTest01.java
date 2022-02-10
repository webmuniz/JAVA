package academy.devdojo.maratonajava.javacore.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        final Path dir = Paths.get("/home/elvis");
        final Path clazz = Paths.get("/home/elvis/devdojofoda/HelloWorld.java");

        final Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        final Path absolut1 = Paths.get("/home/elvis");
        final Path absolut2 = Paths.get("/user/local");
        final Path absolut3 = Paths.get("/home/elvis/devdojofoda/HelloWorld.java");
        final Path relative1 = Paths.get("temp");
        final Path relative2 = Paths.get("temp/temp.2022");

        System.out.println("1 - " + absolut1.relativize(absolut3));
        System.out.println("2 - " + absolut3.relativize(absolut1));
        System.out.println("3 - " + absolut1.relativize(absolut2));
        System.out.println("4 - " + relative1.relativize(relative2));
        //Problems when working with relative and absolute
        //System.out.println("5 - " + absolut1.relativize(relative1));

    }
}
