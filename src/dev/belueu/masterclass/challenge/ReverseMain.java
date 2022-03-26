package dev.belueu.masterclass.challenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ReverseMain {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter array size: ");
        int size = scanner.nextInt();
        System.out.println("The array has: " + size + " positions");

        int[] array = new int[size];
        int i = 0;
        for (int val : array) {
            System.out.println("Enter a value for position: " + i);
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("\n");

        System.out.println("Original array");
        printArray(array);
        System.out.println("\n");

        System.out.println("Unsorted reversed array");
        int[] reveredArray = reverseArray(array);
        printArray(reveredArray);
        System.out.println("\n");

        System.out.println("Sorted and reversed array");
        int[] sortedAndReversedArray = IntStream.of(array).boxed().sorted(Comparator.reverseOrder()).mapToInt(value -> value).toArray();
        printArray(sortedAndReversedArray);
        System.out.println("\n");

        System.out.println("Sorted array");
        int[] sortedArray = Arrays.stream(array).sorted().toArray();
        printArray(sortedArray);
        System.out.println("\n");

    }

    private static int[] reverseArray(int[] array) {
        int[] reversedArray = Arrays.copyOf(array, array.length);

        int i = array.length - 1;
        for (int value : array) {
            reversedArray[i] = value;
            i--;
        }
        return reversedArray;
    }

    private static void printArray(int[] array) {
        for (int val : array) {
            System.out.print(val + " ");
        }
    }
}
