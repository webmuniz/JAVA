package academy.devdojo.maratonajava.javacore.exceptions.runtime.test;

public class RuntimeExceptionTest02 {
    //runtime exception não é obrigatório fazer tratamento;
    public static void main(String[] args) {
        division(1, 0);
        System.out.println("End Code");
    }

    /**
     *
     * @param a
     * @param b cannot be zero
     * @return
     * @throws IllegalArgumentException if "b" is zero
     */

    private static int division(int a, int b){
        if( b == 0){
            throw new IllegalArgumentException("illegal argument. 'b' cannot be zero!");
        }
        return a / b;
    }
}
