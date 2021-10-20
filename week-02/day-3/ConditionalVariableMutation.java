package com.greenfox.conditionals;

public class ConditionalVariableMutation {
    public static void main(String[] args) {
    double a = 24;
    int out = 0;
    // Ha a páros, növeld az out változó értékét 1-gyel
    if (a % 2 == 0 ) {
        out += 1;
    }
    System.out.println("out: " + out);




    int b = 300;
    String out2 = "";
    // Ha b 10 és 20 között van, akkor az out2 legyen "Édes!"
    // Ha b kevesebb, mint 10, out2 legyen "Kevés!"
    // Ha b több, mint 20, out2 legyen "Sok!"

    if ( (b > 10) && (b < 20)) {
        System.out.println("out2: " + "Édes!");
    }
    if ( b < 10){
        System.out.println("out2: " + "Kevés!");
        }
    if ( b > 20) {
        System.out.println("out2: " + "Sok!");
    }

    System.out.println(out2);


    int c = 123;
    int credits = 33;
    boolean isBonus = true;
    // Ha credits legalább 50,
    // és isBonus hamis, c legyen csökkentve 2-vel
    // Ha credits kisebb, mint 50,
    // és isBonus hamis, c legyen csökkentve 1-gyel
    // Ha isBonus igaz, c ne változzon

        if ((credits >= 50) && (isBonus == false)) {
            c -= 2;
        }

        if ((credits < 50) && (isBonus == false)) {
            c -= 1;
        }

        if (isBonus == true)

        System.out.println("c = " + c);




    int d = 11;
    int time = 20;
    String out3 = "";
    // Ha d osztható 4-gyel
    // és a time nem több, mint 200
    // out3 legyen "check"
    // Ha time nagyobb, mint 200
    // out3 legyen "Az idő lejárt!"
    // különben out3 legyen "Fuss, Forest, Fuss!"

    if (d % 4 == 0 && time <= 200) {
        out3 = "check";
    }

    if (time > 200) {
        out3 = "Az idő lejárt!";
    } else {
        out3 = "Fuss, Forest, Fuss!";
    }

    System.out.println("out3: " + out3);
  }

}
