package com.basics;

import java.util.Arrays;

public class varargs {
    static void main(String[] args) {
        fun("hi","hiello");
    }
    static void fun(String ...a){
        System.out.println(Arrays.toString(a));
        a[0]="reddy";
        System.out.println(Arrays.toString(a));
    }
}
