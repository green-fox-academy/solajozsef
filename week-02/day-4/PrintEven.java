package com.greenfox.loops;

public class PrintEven {
    public static void main(String[] args) {

        // Írj egy programot, ami kiírja az összes páros számot 0 és 500 között

        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0) {
                System.out.print(" " + i);
            }
        }


    }
}
