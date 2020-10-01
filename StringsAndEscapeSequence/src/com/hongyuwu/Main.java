package com.hongyuwu;

public class Main {

    public static void main(String[] args) {
        // string
        String message = "  Hello World" + "!!  ";
        boolean starts = message.startsWith("!!");
        boolean ends = message.endsWith("!!");
        System.out.println(message);
        System.out.println(starts);
        System.out.println(ends);
        System.out.println(message.length());
        System.out.println(message.indexOf("H")); // 0
        System.out.println(message.indexOf("e")); // 3
        System.out.println(message.indexOf("wu")); // -1
        System.out.println(message.replace("!", "*"));
        System.out.println(message);
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());

        // escape sequences
        String m = "Hello \n\"Hongyu\"";
        System.out.println(m);

        String p = "c:\\\twindows\\...";
        System.out.println(p);
    }
}
