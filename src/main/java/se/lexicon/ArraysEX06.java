package se.lexicon;

import java.text.DecimalFormat;

public class ArraysEX06 {

    public static void main(String[] args) {
        double[] forAverage = {34, 15, 73, 15, 4, 155};
        double total = 0;

        for (double v : forAverage) {
            total += v;
        }

        DecimalFormat df = new DecimalFormat("###.#");
        System.out.println("Average is: " + df.format(total / forAverage.length));
    }
}
