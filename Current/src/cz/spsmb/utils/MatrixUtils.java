package cz.spsmb.utils;

public class MatrixUtils {

    public static int[][] generate(int width, int height, int min, int max) {
        int[][] array = new int[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
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
        for (int i = 0; i < array.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("]");
        }
        System.out.println();
    }

    public static int[][] plus(int[][] matrix1, int[][] matrix2) {
        int[][] matrixSum = new int[matrix1.length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrixSum;
    }
}
