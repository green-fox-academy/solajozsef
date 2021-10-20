package com.greenfox.cuboid;

public class Cuboid {
    public static void main(String[] args) {
    // Írj egy programot, ami egy téglatest 3 oldalát tartalmazza változókban (doubles)
    // A program írja ki a felületét és térfogatát a testnek ilyen formátumban:
    //
    // Felület: 600
    // Térfogat: 1000

        double length = 15;
        double breadth = 10;
        double height = 5;

        // Total Surface area = 2 (Length x Breadth + breadth x height + Length x height)

        double totalSurfaceArea = 2 *(length * breadth + breadth * height + length * height);
        System.out.println("Felület: " + (int)totalSurfaceArea);

        // Volume of the cuboid = (length × breadth × height)

        double volumeOfTheCuboid = length * breadth * height;
        System.out.println("Térfogat: " + (int)volumeOfTheCuboid);
  }
}
