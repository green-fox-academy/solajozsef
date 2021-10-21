package com.greenfox.conditionals;

import java.util.Scanner;
public class OneTwoALot {
    public static void main(String[] args) {
        // Írj egy programot ami beolvas egy számot a standard input-ból (scanner),
        // Ha a szám kisebb vagy egyenlő 0-val, írja ki, hogy: "Nem elég"
        // Ha a szám egyenlő 1-gyel, írja ki, hogy: "Egy"
        // Ha a szám egyenlő 2-vel, írja ki, hogy: "Kettő"
        // Ha a szám nagyobb, mint 2, írja ki, hogy: "Sok"

        Scanner scanner = new Scanner((System.in));
        System.out.print("Adj meg egy egész számot: ");
        int inNumber = scanner.nextInt();
        //  scanner.close();

        if (inNumber <= 0) {
            System.out.println("Nem elég");
        }
        if (inNumber == 1) {
            System.out.println("Egy");
        }
        if (inNumber == 2) {
            System.out.println("Kettő");
        }
        if (inNumber > 2) {
            System.out.println("Sok");
        }


       // System.out.println(inNumber);

    }
}
