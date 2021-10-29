package com.gfa.trialexam.solution;

public class GrammarCheck {
    public static void main(String[] args) {
    /*
    Készíts egy publikus függvényt `grammarCheck` névvel,
    amely egy string-et (`text`) vár paraméterként,
    és ellenőrzi, hogy a kapott string-ben a `.` írásjelek után
    az első betűk mindenhol nagybetűk-e.
    A választ a függvény egy boolean (logikai) értékként adja vissza.

    Példák:

    grammarCheck("Ez egy jó példa. Ez egy jó példa.");

    Amivel vissza kell térnie: `true`.

    grammarCheck("ez még mindig egy jó példa. Hiszen a második mondat nagybetűvel kezdődik.");

    Amivel vissza kell térnie: `true`.

    grammarCheck("Ez egy rossz példa. itt nincs nagybetű.");

    Amivel vissza kell térnie: `false`.
    */
        String text = "This table is awesome. but the chair is awful.";
        grammarCheck(text);

    }

    public static boolean grammarCheck(String text) {

        int indexOfDot = text.indexOf(".");
      //  System.out.println(indexOfDot);


        if (Character.isUpperCase(text.charAt(indexOfDot + 1)) || Character.isUpperCase(text.charAt(indexOfDot + 2)) ) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

      //  System.out.println(text.charAt());

        return true;
    }
}
