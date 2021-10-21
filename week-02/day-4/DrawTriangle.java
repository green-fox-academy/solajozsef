package com.greenfox.loops;

import java.util.Scanner;

public class DrawTriangle {
    public static void main(String args[]) {
        // Hozz létre egy egész szám típusú, lineCount nevű változót.
// Írj egy programot, ami egy számot kér a standard input-ból és
// elmenti azt a lineCount változóban.
// Rajzoljon egy ilyen háromszöget:
//
// *
// **
// ***
// ****
//
// A háromszögnek annyi sora legyen, mint amennyi a lineCount értéke.

        int lineCount;
        Scanner scanner = new Scanner((System.in));
        System.out.print("Adj meg egy számot: ");
        lineCount = scanner.nextInt();

        int i, j;

        for (i = 0; i < lineCount; i++) {

            for (j = 0; j <= i; j++) {

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
