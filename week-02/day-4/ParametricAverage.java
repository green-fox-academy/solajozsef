package com.greenfox.loops;

import java.util.Scanner;

public class ParametricAverage {
    public static void main(String args[]) {

        // Írj egy programot, ami egy számot kér a standard input-ból.
// Amennyi az első szám értéke volt, annyiszor kell új számot kérnie.
// Ha megkapta az összes számot, printelje ki az összegét és
// az átlagát ezeknek a számoknak a következő formátumban:
//
// Összeg: 22, Átlag: 4.4


        int number;
        Scanner scanner = new Scanner((System.in));
        System.out.print("Adj meg egy számot: ");
        number = scanner.nextInt();

        int i;
        int numToManipulate = 0;
        int sumOfNumbers = 0;

        for (i = 0; i < number; i++) {
            System.out.print("Adj még egy számot: ");
            numToManipulate = scanner.nextInt();
            sumOfNumbers += numToManipulate;
        }
        System.out.println();
        System.out.print("Összeg: " + sumOfNumbers + ",  " + "Átlag: " + (double)sumOfNumbers / number);

    }
}
