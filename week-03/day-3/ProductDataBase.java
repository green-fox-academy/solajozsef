package com.greenfox.datastructures;

import java.util.HashMap;
import java.util.Map;

public class ProductDataBase {
    public static void main(String[] args) {
 /*       Termék adatbázis
        A termék adatbázisunkat egy asszociatív tömbként(Map) fogjuk reprezentálni,
        ahol a termék nevek (kulcs) Stringek és azok árai (érték) pedig Integerek.
        Készíts egy Map-et az alábbi kulcs-érték párokkal:

        Termék név (kulcs)	Ár (érték)
        Eggs	200
        Milk	200
        Fish	400
        Apples	150
        Bread	50
        Chicken	550
        Készíts egy alkalmazást, mely megoldja az alábbi problémákat:

        How much is the fish?
        Melyik a legdrágább termék?
        Mi a termékek átlag ára?
        Hány termék ára van 300 alatt?
        Van-e olyan termék melyet pontosan 125Ft-ért tudunk megvenni?
        Melyik a legolcsóbb termék?  */

        HashMap<String, Integer> dataBase = new HashMap<>();

        dataBase.put("Eggs", 200);
        dataBase.put("Milk", 200);
        dataBase.put("Fish", 400);
        dataBase.put("Apples", 150);
        dataBase.put("Bread", 50);
        dataBase.put("Chicken", 550);

        System.out.println(dataBase.get("Fish"));
        System.out.println(dataBase.values());

        // most expensive product
        String mostExpensiveProduct = null;
        Integer mostExpensivePrice = 0;
        for (Map.Entry<String, Integer> product : dataBase.entrySet()) {
            if (product.getValue() > mostExpensivePrice) {
                mostExpensivePrice = product.getValue();
                mostExpensiveProduct = product.getKey();
            }

        }
        System.out.println("Most expensive product: " + mostExpensiveProduct +": "+ mostExpensivePrice);

        // average price of products
        // double averagePrice = 0;
        double sum = 0.0;
        for (double d : dataBase.values()) {
            sum += d;
        }
        System.out.println("Average price: " + sum / dataBase.size());

        // products below 300
        int piece = 0;
        for (int i : dataBase.values()) {
            if (i < 300) {
                piece += 1;
                System.out.println(piece);
            }
        }
        System.out.println("Number of products prices of which is below 300: " + piece);

        // product at exactly 125 Ft
        System.out.println(dataBase.containsValue(125));

        // cheapest product
        String cheapestProduct = null;
        Integer lowestPrice = 1000;
        for (Map.Entry<String, Integer> product : dataBase.entrySet()) {
            if (product.getValue() < lowestPrice) {
                lowestPrice = product.getValue();
                cheapestProduct = product.getKey();
            }

        }
        System.out.println("Cheapest product: " + cheapestProduct +": "+ lowestPrice);



    }

}

