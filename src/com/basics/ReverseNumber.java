package com.basics;

import java.util.Scanner;

public class ReverseNumber {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number you want to reverse");
        int n=sc.nextInt();
        int temp=n,r=0;
        while(temp>0){
            int t=temp%10;
            r=r*10+t;
            temp/=10;

        }
        System.out.println("Reversed number is of given"+n+"is "+r);
    }
}
