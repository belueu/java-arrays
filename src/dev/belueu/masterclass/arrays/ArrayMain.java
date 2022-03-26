package dev.belueu.masterclass.arrays;

import java.util.Scanner;

public class ArrayMain {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello Java Arrays\n");

        // declaring and initializing an array of integers
        int[] ints = new int[10];
        double[] doubles = new double[100];
        String[] strings = new String[100];

        // Looping over the array and assigning a value of i to each element of the array
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i;
        }

        // Looping over the array and printing each value
        for (int num : ints) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = Math.random() * 100;
        }

        printArray(doubles);


    }

    public static void printArray(int[] array) {
        for (int val : array) {
            System.out.println(val);
        }
    }

    public static void printArray(double[] array) {
        for (double val : array) {
            System.out.println(val);
        }
    }

    public static void printArray(String[] array) {
        for (String val : array) {
            System.out.println(val);
        }
    }
}
