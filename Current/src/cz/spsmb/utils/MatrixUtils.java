package cz.spsmb.utils;

public class MatrixUtils {

    public static int[][] generate(int size, int min, int max) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = cz.spsmb.utils.MathUtils.randomNumber(min, max);
            }
        }
        return array;
    }

    public static int[][] generateDiagonal(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            array[i][i] = 1;
        }
        return array;
    }

    public static void print(int[][] array) {
        for (int[] ints : array) {
            System.out.print("[ ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println("]");
        }
        System.out.println();
    }

    public static int[][] plus(int[][] matrix1, int[][] matrix2) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                matrix1[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrix1;
    }
}
