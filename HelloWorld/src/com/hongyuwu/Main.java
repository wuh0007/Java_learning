package com.hongyuwu;
import java.util.Date;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // primitive type(simple value): byte(1), short(2), int(4), long(8), float(4), double(8), char(2), boolean(1)
        byte myAge = 30;
        long viewsCount = 3_123_456_789L; // by default, int
        float price = 10.99F; // by default, double
        char letter = 'A';
        boolean isEligible = false;
        System.out.println(myAge);
	    System.out.println("Hello World");

        // reference type(complex object): Date
        byte age = 30; // memory automatically reallocate by JAVA run time env
        Date now = new Date(); // instance of Date class, (new object)
        System.out.println(now);

        int herAge = myAge;
        System.out.println(herAge);

        // primitive vs reference types
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

    }
}
