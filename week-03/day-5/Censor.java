package com.gfa.trialexam.solution;

public class Censor {
    public static void main(String[] args) {
    /*
    Készíts egy publikus függvényt `censor` névvel,
    amely három string-et (karakterláncot) kér paraméterként és egy string-gel tér vissza.
    Az első string (`text`) az a szöveg, amit a függvénynek meg kell majd változtatnia.
    A második string (`originalWord`) lesz az,
    amit minden előfordulása során a harmadik string-re (`newWord`) kell megváltoztatni.
    A függvénynek térjen vissza a módosított string-el.
    Fontos, hogy nem használhatod egyik beépített helyettesítő függvényt sem!

    Példa:

    censor("A kedvenc gyümölcsöm a(z) alma", "alma", "banán");

    Amivel vissza kell térnie: `"A kedvenc gyümölcsöm a(z) banán"`.
     */

        String text = "My favorite team used to be Watford.";
        String originalWord = "Watford";
        String newWord = "Everton";

        censor(text, originalWord, newWord);

    }

    public static String censor(String text, String originalWord, String newWord) {
        String newText = "";

        int startOfOriginalWord = text.indexOf(originalWord);
        String textWithoutChelsea = text.substring(0, startOfOriginalWord);
        newText = textWithoutChelsea + newWord;
        System.out.print(newText);

        return newText;
    }

}
