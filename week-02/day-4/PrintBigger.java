package com.greenfox.conditionals;

import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Írj egy programot, ami két számot kér a standard input-ból
        // és kiírja a nagyobbat

        Scanner scanner = new Scanner((System.in));
        System.out.print("Adj meg egy számot: ");
        int inNumber1 = scanner.nextInt();

        System.out.print("Adj meg egy másik számot: ");
        int inNumber2 = scanner.nextInt();

        if (inNumber1 > inNumber2) {
            System.out.println(inNumber1);
        } else {
            System.out.println(inNumber2);
        }
        scanner.close();
    }
}
