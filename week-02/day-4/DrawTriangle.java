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

        int sor, oszlop;

        for (sor = 0; sor < lineCount; sor++) {

            for (oszlop = 0; oszlop <= sor; oszlop++) {

                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
