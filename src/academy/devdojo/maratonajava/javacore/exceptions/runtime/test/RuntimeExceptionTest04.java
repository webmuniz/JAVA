package academy.devdojo.maratonajava.javacore.exceptions.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("inside ArrayIndexOutOfBoundsException ");
        } catch (IndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("inside IndexOutOfBoundsException");
        } catch (RuntimeException e) { //Exception mais genérica deve fincar no final!
            System.out.println("Inside RuntimeException");
        }

        try {
            maybeException();
            //As classes Exceptions não podem estar na mesma linhda e herança para serem colocadas no mesmo catch;
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    private static void maybeException() throws SQLException, IOException {
//Esta classe obriga quem a chama a tratar as exceptions;
    }

}
