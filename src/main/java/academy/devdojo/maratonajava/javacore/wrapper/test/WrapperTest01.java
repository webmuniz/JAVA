package academy.devdojo.maratonajava.javacore.wrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {

        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        //Tipos primitivos em classes:

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; //autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; //unboxing
        Integer intW2 = Integer.parseInt("1"); //String to int, poderia ser outros tipos primitivos menos char;
        boolean isTrue = Boolean.parseBoolean("true");
        System.out.println(isTrue);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('T'));
        System.out.println(Character.toLowerCase('T'));
        System.out.println(Character.toUpperCase('b'));

    }
}
