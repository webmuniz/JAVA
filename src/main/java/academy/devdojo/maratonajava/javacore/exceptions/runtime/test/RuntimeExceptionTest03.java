package academy.devdojo.maratonajava.javacore.exceptions.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {

        openConnection2();

    }

    private static String openConnection() {
        try {
            System.out.println("Opening files...");
            System.out.println("Writing data to file...");
            return "connection opened";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Closing resources released by SO");
        }
        return null;
    }

    private static void openConnection2() {
        try {
            System.out.println("Opening files...");
            System.out.println("Writing data to file...");
        } finally {
            System.out.println("Closing resources released by SO");
        }
    }


}
