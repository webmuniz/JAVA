package academy.devdojo.maratonajava.introduction;

public class A02PrimitiveTypes {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int age = 100;
        long bigNumber = 100000L;
        double salaryDouble = 2000.5;
        float salaryFloat = 2500.6F; //type F in the end.
        byte ageByte = -128;
        short ageShort = 10;
        boolean isTrue = true;
        boolean isFalse = false;
        char caracterAsc = 65; //ASCII
        char caracterUni = '\u0041'; //Unicode

        String name = "Goku";

        System.out.println(age + " years");
        System.out.println(bigNumber);
        System.out.println(salaryDouble);
        System.out.println(salaryFloat);
        System.out.println(ageByte);
        System.out.println(ageShort);
        System.out.println(isTrue);
        System.out.println(isFalse);
        System.out.println(caracterAsc);
        System.out.println(caracterUni);
        System.out.println("Hello! I am "+name);
    }
}
