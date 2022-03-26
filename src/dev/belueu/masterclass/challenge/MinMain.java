package dev.belueu.masterclass.challenge;

import java.util.Scanner;

public class MinMain {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] numbers = readInteger();
        printArray(numbers);
        int arrayMinValue = findMin(numbers);
        System.out.println("The minimum value from the array is : " + arrayMinValue);
    }

    private static int[] readInteger() {
        System.out.println("Enter the size of the array: \r");
        int size = scanner.nextInt();
        System.out.println("The array has: " + size + " positions");

        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a value for position " + i + " of the array: \r");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    private static void printArray(int[] array) {
        int i = 0;
        for (int val : array) {
            System.out.println("Position: " + i + ", Value: " + val);
            i++;
        }
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int val : array) {
            if (val < min) {
                min = val;
            }
        }
        return min;
    }
}
