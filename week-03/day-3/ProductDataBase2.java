package com.greenfox.datastructures;

/* Termék adatbázis 2
        A termék adatbázisunkat egy asszociatív tömbként(Map) fogjuk reprezentálni, ahol a termék
        nevek (kulcs) Stringek és azok árai (érték) pedig Integerek.

        Készíts egy Map-et az alábbi kulcs-érték párokkal:

        Termék név (kulcs)	Ár (érték)
        Eggs	200
        Milk	200
        Fish	400
        Apples	150
        Bread	50
        Chicken	550
        Készíts egy alkalmazást, mely megoldja az alábbi problémákat:

        Mely termékek kerülnek kevesebbe mint 201? (csak a név)
        Mely termékek kerülnek többe mint 150? (név és ár) */

import java.util.HashMap;

public class ProductDataBase2 {
    public static void main(String[] args) {
        HashMap<String, Integer> dataBase2 = new HashMap<>();

        dataBase2.put("Eggs", 200);
        dataBase2.put("Milk", 200);
        dataBase2.put("Fish", 400);
        dataBase2.put("Apples", 150);
        dataBase2.put("Bread", 50);
        dataBase2.put("Chicken", 550);

        // products below 201 ft

        for (String name : dataBase2.keySet()) {
            if (dataBase2.get(name) < 201) {
                System.out.print("  " + name);
            }
        }
        System.out.println();
        System.out.println();

        // products above 150
        for (String name : dataBase2.keySet()) {
            if (dataBase2.get(name) > 150) {
                System.out.println(name + ": " + dataBase2.get(name));
            }
        }
    }
}
