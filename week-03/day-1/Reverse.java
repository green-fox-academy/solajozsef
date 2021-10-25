package com.greenfox.strings;

public class Reverse {
    public static void main(String... args) {
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Készíts egy függvényt ami megfordít egy Stringet, amit
        // bemeneti paraméterként kap.
        // Használd a függvényt a "toBeReversed" változón ellenőrzésként.
        // Elsőként próbáld megoldani a feladatot a charAt() függvénnyel, majd
        // opcionálisan akárhogy.

        // System.out.println(reverse(toBeReversed));

        //  char[] toBeReversedArray = toBeReversed.toCharArray()
        for (int i = toBeReversed.length() - 1; i >= 0; i--) {
            System.out.print(toBeReversed.charAt(i));
        }
        System.out.println();

        reverse(toBeReversed);

    }

    public static void reverse(String str) {

        char[] try1 = str.toCharArray();

        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);
    }

}
