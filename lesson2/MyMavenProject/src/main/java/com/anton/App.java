package com.anton;

public class App {
    public static boolean negate(boolean bool) {
        return !bool;
    }

    public static String concatenate(String first, String second) {
        return first + second;
    }

    public static int power(int base, int power) {
        if (power == 0) return 1;
        return base * power(base, power - 1);
    }

    public static void main( String[] args ) {
        System.out.println(App.negate(false));
        System.out.println(App.concatenate("Hello", " world!"));
        System.out.println(App.power(2, 3));
    }
}
