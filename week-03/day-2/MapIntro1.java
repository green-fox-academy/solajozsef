package com.greenfox.datastructures;

import java.util.HashMap;

public class MapIntro1 {
    public static void main(String[] args) {
 /*       Map bevezetés 1
        Asszociatív tömbökkel(Map) fogunk játszani. Nyugodtan
        használj bármilyen beépített függvényt, ahol lehetséges.
        Készíts egy üres asszociatív tömböt (Map) ahol a kulcsok(keys) integerek és az
        értékek(values) karakterek.
        Írasd ki hogy a map üres e vagy sem.
        Add hozzá az alábbi kulcs(key) érték(value) párokat a map-hez.

 Kulcs (Key)	Érték (Value)
        97	a
        98	b
        99	c
        65	A
        66	B
        67	C
        Írasd ki az összes kulcsot.
        Írasd ki az összes értéket.
        Add hozzá a D értéket az 68-as kulccsal.
        Írasd ki hány kulcs érték pár van a map-ben.
        Írasd ki a 99-es kulcshoz tartozó értéket.
        Töröld ki azt a kulcs-érték párt, ahol a kulcs 97.
        Írasd ki van-e társítva érték a 100-as kulcshoz vagy sem.
        Távolítsd el az összes kulcs érték párt. */

        HashMap<Integer, Character> hmap = new HashMap<>();
        hmap.put(97, 'a');
        hmap.put(98, 'b');
        hmap.put(99, 'c');
        hmap.put(65, 'A');
        hmap.put(66, 'B');
        hmap.put(67, 'C');


        System.out.println(hmap.keySet());

        for (Integer i : hmap.keySet()) {
            System.out.println(hmap.get(i));
        }

        hmap.put(68, 'D');
        System.out.println(hmap.size());
        System.out.println(hmap.get(99));
        hmap.remove(97);
        System.out.println(hmap.get(100));

        hmap.clear();
        System.out.println(hmap.size());


    }
}
