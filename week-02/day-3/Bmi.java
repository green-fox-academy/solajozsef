package com.greenfox.bmi;

public class Bmi {
    public static void main(String[] args) {
    double massInKg = 81.2;
    double heightInM = 1.78;

    // Számíttasd és írasd ki a testtömeg-indexet (BMI)
    // a változókat használva
    // BMI = kg / m2

    double bmi;
    bmi = massInKg / (heightInM * heightInM);
    System.out.println("bmi = " + bmi);

  }
}
