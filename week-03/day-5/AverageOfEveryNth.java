package com.gfa.trialexam.solution;

public class AverageOfEveryNth {
    public static void main(String[] args) {
        /*
        Készíts egy `averageOfEveryNth` nevű publikus függvényt, ami két paramétert vár:

        - egy `numbers` nevű tömböt pozitív integer-ekkel,
        - egy `n` nevű pozitív integer-t.

        A függvény térjen vissza a kapott tömb minden `n`-edik elemének átlagával.

        Példák:

        averageOfEveryNth(new int[] { 2, 4, 10, 34, 3, 16, 3, 21 }, 3)

        Amivel vissza kell térnie: `13`, mert `10` és `16` átlaga `13`.

        averageOfEveryNth(new int[] { 2, 4, 10, 34, 3, 16, 3, 21 }, 2)

        Amivel vissza kell térnie: `18.75`, mert `4`, `34`, `16`, `21` átlaga `18.75`.

        averageOfEveryNth(new int[] {2, 4, 10, 34, 3, 16, 3, 21 }, 10)

        Amivel vissza kell térnie: `0`, mert nincs érvényes elem.
    */

        int[] numbers = {2, 4, 6, 54, 2, 9};
        int n = 3;

        averageOfEveryNth(numbers, n);


    }

    public static double averageOfEveryNth(int[] numbers, int n) {
        double sumOfNumbers = 0;

        int piece = 0;
        if (numbers.length >= n) {
            for (int i = n-1; i < numbers.length; i+=n) {

                sumOfNumbers += numbers[n -1];
                n += n;
                piece += 1;

            }
            System.out.println(sumOfNumbers/(piece ));
        } else {
            System.out.println(0);
        }

        return sumOfNumbers / n;
    }
}
