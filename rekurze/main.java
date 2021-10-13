package cz.polacek.rekurze;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.print("Input your number: ");
        int a = sc.nextInt();
        int sum = recursion(a);
        int fac = factorial(a);
        System.out.println("Recursion: " + colors.ANSI_RED +  + sum + colors.ANSI_RESET);
        System.out.println("Factorial: " + colors.ANSI_BLUE +  + fac + colors.ANSI_RESET);
    }

    public static int fibonnacciRecursion(int value) {
        if (value <= 0) {
            return 0;
        } if (value == 1) {
            return 1;
        }
        return fibonnacciRecursion(value - 1) + fibonnacciRecursion(value - 2);
    }

    public static int recursion(int count) {
        int valueBefore = 0;
        int valueAfter = 1;
        int valueSum = valueBefore + valueAfter;
        for (int i = 0; i < count-1; i++) {
            valueSum = valueBefore + valueAfter;
            valueBefore = valueAfter;
            valueAfter = valueSum;
        }
        return valueSum;
    }

    public static int factorial(int value) {
        if (value <= 1) {
            return 1;
        }
        return value * factorial(value - 1);
        // return 5 * factorial(4);
        // return 4 * factorial(3);
        // return 3 * factorial(2);
        // return 2 * factorial(1);

    }
}
