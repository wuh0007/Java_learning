package com.hongyuwu;

public class Main {

    public static void main(String[] args) {
        // constant
        final float PI = 3.14F; // cannot be changed later on. usually use capitalized name

        // arithmetic expressions
        int result = 10 + 3;
        System.out.println(result);
        System.out.println(10 / 3);
        System.out.println((double)10 / (double)3);

        int x = 1;
        ++x;
        System.out.println(x);

        int y = x++;
        System.out.println(x);
        System.out.println(y);

        x += 2;
        System.out.println(x);

        // order of operations: () > */ > +-
        int z = 10 + 3 * 2;
        System.out.println(z);
    }
}
