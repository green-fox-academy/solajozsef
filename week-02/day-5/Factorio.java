package com.greenfox.functions;

public class Factorio {
    public static void main(String[] args) {
        // - Hozz létre egy class-t `Factorio` névvel és benne a main függvényt.

// - Készíts egy függvényt `factorio` névvel,
//   mely visszaadja a bemeneti paraméter faktoriális értékét.

        factorio(15);
    }

    public static long factorio(int number) {
        long sumFactorial = 1;
        for (int i = 2; i <= number ; i++) {
            sumFactorial *= i;

        }
        System.out.println(sumFactorial);
        return sumFactorial;
    }

}
