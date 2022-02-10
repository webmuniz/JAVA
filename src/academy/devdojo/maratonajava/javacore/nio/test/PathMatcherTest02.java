package academy.devdojo.maratonajava.javacore.nio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class FindAllTestJavaOrClass extends SimpleFileVisitor<Path> {
    private final PathMatcher macther = FileSystems.getDefault().getPathMatcher("glob:**/*Test*.{java,class}");

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (macther.matches(file)) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class PathMatcherTest02 {
    public static void main(String[] args) throws IOException {
        final Path root = Paths.get(".");
        Files.walkFileTree(root, new FindAllTestJavaOrClass());
    }
}
