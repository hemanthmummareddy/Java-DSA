package com.basics;

import java.util.Scanner;

public class switchDays {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter day(As number): ");
        int day=sc.nextInt();
//        switch(day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednsay");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("invalid");
//        }
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wedensday");
                break;

        }
    }
}
