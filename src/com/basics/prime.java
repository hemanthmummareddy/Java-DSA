package com.basics;

import java.util.Scanner;

public class prime {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
            else{
//                System.out.println("FAlse");
            }
        }
    }

    private static boolean isPrime(int i) {
        if(i<=1){
            return false;
        }
        int c=2;
        while(c*c <=i){
            if(i%c==0){
                return false;
            }
            c++;
        }
        return c*c>i;
    }
}

