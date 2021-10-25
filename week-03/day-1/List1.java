package com.greenfox.datastructures;

import java.util.ArrayList;

public class List1 {
    public static void main(String[] args) {
        /*
        Listákkal fogunk játszani. Nyugodtan használj bármilyen beépített függvényt, ahol lehetséges.

Készíts egy üres listát, ami Stringeket tartalmaz.
Írasd ki a lista elemeinek a számát.
Add hozzá(add) Williemet a listához.
Írasd ki a lista üres e vagy sem.
Add hozzá Johnt a listához.
Add hozzá Amandát a listához.
Írasd ki a lista elemeinek a számát.
Írasd ki a lista harmadik elemét.
Iterálj végig a listán és írasd ki az összes nevet
William
John
Amanda
Töröld a második elemet a listából
Iterálj végig a listán fordított sorrendben és írasd ki az összes nevet.
Amanda
William
Távolítsd el a lista összes elemét.
         */

        ArrayList<String> smallList = new ArrayList<>();
        System.out.println(smallList.size());
        smallList.add("William");
        System.out.println(smallList);
        smallList.add("John");
        smallList.add("Amanda");
        System.out.println(smallList.size());
        System.out.println(smallList.get(2));

        for (String i : smallList) {
            System.out.println(i + "  ");
        }
        smallList.remove(1);
        for (int i = smallList.size() -1; i >= 0; i--) {
            System.out.println(smallList.get(i));
        }

        smallList.removeAll(smallList);
        System.out.println(smallList.size());


    }
}
