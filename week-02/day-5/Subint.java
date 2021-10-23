package com.greenfox.functions;

public class Subint {
    public static void main(String[] args) {
        // - Készíts egy függvényt ami bemeneti paraméterként egy számot és egy integer
        //   array-t vár.

        // - Visszaadja a bemeneti tömb azon indexeit, ahol a tömb értékei tartalmazzák
        //   az első bemeneti értéket.
        // - Vagy egy üres array-t ad vissza, amennyiben az első bemeneti értéket a lista
        //   sehol sem tartalmazza.

        //  Példa:
        //   System.out.println(Arrays.toString(subInt(1, new int[]{1, 11, 34, 52, 61})));
        //  Eredmény kiíratva: `[0, 1, 4]`
        // System.out.println(Arrays.toString(subInt(9, new int[]{1, 11, 34, 52, 61})));
        //  Eredmény kiíratva: '[]'

        // Megjegyzés: Az array kiirattatására használhatjuk az Arrays.toString() függvényt.
        // Vagy használhatjuk a végigiterálást is.
        subint(5, new int[]{121, 22, 365, 46, 32, 67, 542});

    }

    public static void subint(int number, int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            
            while (intArray[i] > 0) {

                if (intArray[i] % 10 == number) {
                    System.out.print(i + "  ");
                    break;
                } else {

                    intArray[i] /= 10;

                }
            }
        }
    }
}

/*
 while (x > 0)
        {
            if (x % 10 == d)
                break;

            x = x / 10;
        }
 */
