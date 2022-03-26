package dev.belueu.masterclass.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayMain {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] ints = getInts(5);
        printArray(sortArrayAscending(ints));
        System.out.println();
        printArray(sortArrayDescending(ints));

    }

    public static void printArray(int[] array) {
        for (int val : array) {
            System.out.print(val + " ");
        }
    }

    public static int[] getInts(int arraySize) {
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortArrayDescending(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static int[] sortArrayAscending(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        int temp;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] > sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
