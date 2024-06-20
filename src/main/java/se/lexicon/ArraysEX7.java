package se.lexicon;

public class ArraysEX7 {

    public static void main(String[] args) {
        int[] array = {11, 20, 40, 73, 95, 12};

        System.out.print("Array:");
        for (int j : array) {
            System.out.print(" " + j);
        }

        System.out.print("\nOdd Array:");
        for (int j : array) {
            if (j % 2 != 0) {
                System.out.print(" " + j);
            }
        }
    }
}
