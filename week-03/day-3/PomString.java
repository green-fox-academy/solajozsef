package com.greenfox.strings;

public class PomString {
    public static void main(String[] args) {
        String str = "dogpomcatpumdogpzm";
        String str2 = "pomtom";

        stringPom(str);
        stringPom(str2);

    }


    public static String stringPom(String phrase) {
        String withoutPom = phrase.replaceAll("p.m", "");
        System.out.println(withoutPom);
        return withoutPom;

    }

}
