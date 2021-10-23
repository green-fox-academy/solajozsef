package com.greenfox.functions;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        //    Gyakorlat:
        //  Készíts egy isAnagram nevű függvényt, kövesd az eddig
        //  használt nyelvi stílus útmutatót. A függvények bemeneten fogadnia a kell két
        //  stringet és visszaadni egy logikai (boolean) értéket attól függően, hogy a
        //  két string egymás anagrammája vagy sem.
        isAnagram("desserts", "stressed");

    }

    public static boolean isAnagram(String inputString1, String inputString2) {

        char[] inputString1ToChar = inputString1.toCharArray();
        char[] inputString2ToChar = inputString2.toCharArray();
        Arrays.sort(inputString1ToChar);
        Arrays.sort(inputString2ToChar);
        boolean result = Arrays.equals(inputString1ToChar, inputString2ToChar);
        System.out.println(result);

        return result;

    }
}
