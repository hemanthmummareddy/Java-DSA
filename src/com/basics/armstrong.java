package com.basics;

public class armstrong {
    static void main(String[] args) {
//        int n=156;
//        System.out.println(isArmstrong(n));
        for(int i=10;i<=1000;i++){
            if (isArmstrong(i)){
                System.out.print(i+" ");
            }
        }
    }
    static boolean isArmstrong(int n){
        int r=0;
        int temp=n;
        while(n>0){
            int t=n%10;
            r=r+(t*t)*t;
            n/=10;
        }
        return r==temp;
    }
}
