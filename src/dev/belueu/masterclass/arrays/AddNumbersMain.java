package dev.belueu.masterclass.arrays;

import java.util.Scanner;

public class AddNumbersMain {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] ints = getInts();

        printArray(ints);
        System.out.println("The average value of the elements in the array is: " + getAverage(ints));
    }

    public static int[] getInts() {
        System.out.println("Enter the number of elements in the array: \r");
        int size = scanner.nextInt();

        System.out.println("Enter integer numbers for each element of the array: \r");
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    public static void printArray(int[] ints) {
        for (int num : ints) {
            System.out.println(num);
        }
    }

    public static double getAverage(int[] array) {
        double sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        return sum / array.length;
    }
}
