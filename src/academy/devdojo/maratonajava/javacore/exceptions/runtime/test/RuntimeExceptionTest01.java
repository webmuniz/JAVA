package academy.devdojo.maratonajava.javacore.exceptions.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        //Checked - IOException, SQLException...
        //Unchecked - RuntimeException e "filhas" (NullPointerException, NumberFormatException, ClassCastException)

        int[] nums = {1,2};
        System.out.println(nums[2]); //ArrayIndexOutOfBoundsException por não existir num[2];

        Object object = null;
        System.out.println(object.toString()); //NullPointerException por não existir o objeto;

    }
}
