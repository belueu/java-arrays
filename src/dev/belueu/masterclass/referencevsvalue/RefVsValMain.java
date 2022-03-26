package dev.belueu.masterclass.referencevsvalue;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RefVsValMain {

    public static void main(String[] args) {
        int firstInt = 11;
        // The secondInt is assigned the value of firstInt: value of 11
        int secondInt = firstInt;
        System.out.println("Value of firstInt: " + firstInt);
        System.out.println("Value of secondInt: " + secondInt);

        // Incremented secondInt by 1: now secondInt = 12
        secondInt++;

        //  Incremented firstInt by 22: now firstInt = 33
        firstInt += 22;

        // When printing the values of both integers (firstInt and secondInt) there is no relation between them;
        // In other words primitives store values, they don't reference them
        System.out.println("Value of firstInt: " + firstInt);
        System.out.println("Value of secondInt: " + secondInt);

        int[] ints = new int[5];
        // References the ints[] array
        int[] newInts = ints;

        System.out.println("ints[] = " + Arrays.toString(ints));
        System.out.println("newInts[] = " + Arrays.toString(newInts));

        // Added value of 123 to index 0 of the newInts[] array
        // This action will affect also ints[] array
        // This is happening because newInts[] is a reference to ints[]
        newInts[0] = 123;

        System.out.println("ints[] = " + Arrays.toString(ints));
        System.out.println("newInts[] = " + Arrays.toString(newInts));

        // Any change made to any of the 2 arrays will be seen in both: ints[] and newInts[]
        // When feeding the parameter to the modifyArray function the parameter will reference the array passed as a parameter
        modifyReferenceArray(ints);

        System.out.println("ints[] = " + Arrays.toString(ints));
        System.out.println("newInts[] = " + Arrays.toString(newInts));


        System.out.println("ints[] = " + Arrays.toString(ints));
        System.out.println("newInts[] = " + Arrays.toString(newInts));

        System.out.println("Dereference array resulting in new array[] = " + Arrays.toString(modifyDereferenceArray(ints)));
    }

    public static void modifyReferenceArray(int[] array) {
        array[array.length - 1] = 221;
    }

    public static int[] modifyDereferenceArray(int[] array) {
        array = new int[]{1, 3, 23, 4, 5};
        return IntStream.of(array).boxed().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray();
    }


}
