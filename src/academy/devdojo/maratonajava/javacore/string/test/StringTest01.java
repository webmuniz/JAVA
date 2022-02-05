package academy.devdojo.maratonajava.javacore.string.test;

public class StringTest01 {
    public static void main(String[] args) {
        String name = "Elvis"; //String constant pool
        String name2 = "Elvis";
        name = name.concat(" Muniz");
        System.out.println(name);
        System.out.println(name == name2);

        String name3 = new String("Elvis"); //1- reference var | 2- Object String | 3-String on pool of Strings
        System.out.println(name2 == name3);
        System.out.println(name2 == name3.intern());//intern - compare to value.

    }
}
