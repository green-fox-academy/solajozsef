package com.gfa.trialexam.solution;

public class ThreeSum {
    public static void main(String[] args) {
    /*
    Készíts egy `threeSum` nevű publikus függvényt, ami
    - egy integer (egész szám) tömböt (`array`) vár inputként,
    - visszatér a tömb 3 legkisebb elemének összegével (integer-ként)
    - -1-gyel tér vissza, ha a tömb mérete kisebb, mint 3
    - (figyelj arra, hogy a 3 legkisebb elem a tömb 3 különböző eleme legyen,
    azaz nem a legkisebb számot kell megszorozni hárommal)

    Példák:

    threeSum(new int[] { 1, 2, 3, 4, 5 });

    Amivel vissza kell térnie: `6`, mert `1`, `2` és `3`
    adja a legkisebb összeget.

    threeSum(new int[] { 100, 450, 200, 5 });

    Amivel vissza kell térnie: `305`, mert `100`, `200` és `5`
    adja a legkisebb összeget.

    threeSum(new int[] { 1, 2 });

    Amivel vissza kell térnie: `-1`, mert nincs 3 elem a tömbben.
    */

        int[] arr = {33, 2, 123, 5, 15, 42, 56, 2, 78, 9};

        threeSum(arr);

    }

    public static int threeSum(int[] arr) {

        int swap;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int sumOfTheThreeSmallestElements =0;
        if (arr.length < 3) {
            System.out.println(-1);
        } else {
            sumOfTheThreeSmallestElements = arr[0] + arr[1] + arr[2];
            System.out.println("Sum of the 3 smallest elements: " + sumOfTheThreeSmallestElements);

        }
        return sumOfTheThreeSmallestElements;
    }


}
