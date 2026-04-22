package com.basics;

public class shadowing {
    static int x=10;

    static void main(String[] args) {
        System.out.println(x);
        int x;
        x=8;
        System.out.println(x);
        fun();
    }

    private static void fun() {
        System.out.println(x);
    }
}
