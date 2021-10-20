package com.greenfox.averageofinput;

import java.util.Scanner;
public class AverageOfInput {
    public static void main(String[] args) {
    // Írj egy programot, ami 5 egész számot kér be egymás után,
    // majd kiírja a számok összegét és átlagát a következő formátumban:
    //
    // Összeg: 22, Átlag: 4.4

        int[] numbers = new int[5];

        for(int i =0; i < numbers.length; i++) {

            Scanner scanner = new Scanner((System.in));
            System.out.print("Adj meg egy egész számot: ");
            numbers[i] = scanner.nextInt();
          //  scanner.close();

        }
        int sum = 0;

        for(int i =0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println();
        System.out.print("Összeg: " + sum);

        double average = 0;
        for(int i =0; i < numbers.length; i++) {
            average += (numbers[i] / 5);
        }
        System.out.println(", " + "Átlag: " + average);
  }
}
