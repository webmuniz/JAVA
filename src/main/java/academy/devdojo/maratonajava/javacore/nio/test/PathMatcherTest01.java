package academy.devdojo.maratonajava.javacore.nio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        final Path path1 = Paths.get("dir/subdir/file.bkp");
        final Path path2 = Paths.get("dir/subdir/file.txt");
        final Path path3 = Paths.get("dir/subdir/file.java");

        matches(path1, "glob:*.bkp"); // not considerate files
        matches(path1, "glob:**.bkp");//considerate any file
        matches(path1, "glob:**/*.bkp");//considerate any file
        matches(path2, "glob:**/*.{bkp,txt,java}");//or .bkp or .txt or .java
        matches(path3, "glob:**/*.???"); //It doesn't matter what the extension is. need to have 3 characters (???)
        matches(path3, "glob:**/file.????");

    }

    private static void matches(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": "+ matcher.matches(path));
    }
}
