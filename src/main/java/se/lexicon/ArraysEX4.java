package se.lexicon;

import java.util.Arrays;

public class ArraysEX4 {

    public static void main(String[] args) {
        int[] numbers = {20, 33, 49, 75, 94, 120};

        int[] copy = Arrays.copyOf(numbers, numbers.length);

        System.out.println("Original:\t" + Arrays.toString(numbers));
        System.out.println("    Copy:\t" + Arrays.toString(copy));
    }
}
