package academy.devdojo.maratonajava.introduction;

public class A08ArrayMultidimensional02 {
    public static void main(String[] args) {

        int[][] arrayInt = new int[3][];
        int[] array = {3, 4, 5};

        arrayInt[0] = new int[]{1, 2};
        arrayInt[1] = array;
        arrayInt[2] = new int[]{6, 7, 8, 9, 10, 11};

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n----------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }

        }

        //Outras formas de iniciar array multidimensional

        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

    }
}
