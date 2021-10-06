package cz.spsmb;

import cz.spsmb.lesson5th.utils.ArrayUtils;
import cz.spsmb.utils.MatrixUtils;

public class Application {

    public static void main(String[] args) {
        int size = 10;
        int width = size;
        int height = size;
        int min = 0;
        int max = 5;
        int[][] array1 = MatrixUtils.generate(width, height, min, max);
        int[][] array2 = MatrixUtils.generate(width, height, min, max);

        System.out.println("array1:");
        MatrixUtils.print(array1);

        System.out.println("array2:");
        MatrixUtils.print(array2);

        System.out.println("array1 + array2:");
        int sum[][] = MatrixUtils.plus(array1, array2);
        MatrixUtils.print(sum);

        System.out.println("diagonal array:");
        int[][] array3 = MatrixUtils.generateDiagonal(size);
        MatrixUtils.print(array3);
    }
}