package com.greenfox.functions;

public class Sum {
    public static void main(String[] args) {
        // - Hozz létre egy class-t `Sum` névvel és benne a main függvényt.
// - Készíts egy függvényt `sum` névvel mely összeadja a számokat
//   nullától a bemeneti paraméterig és visszaadja azok összegét.

        sum(100);
    }


    public static void sum(int num) {
        int sum = 0;
        for (int i = num; i > 0; i--) {
            sum += i;
        }
        System.out.println("A számok összege " + num + "-ig: " + sum);

    }

}
