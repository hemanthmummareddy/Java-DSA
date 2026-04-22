package com.arrays;

public class armstrongFrom1ToN {
    static void main(String[] args) {
        for(int i=1;i<10000;i++){
            if(armstrong(i))
                System.out.print(i+" ");

        }
    }
    static boolean armstrong(int n){
        int temp=n;
        int power=0;
        while(temp!=0){
            power++;
            temp/=10;
        }
        temp=n;
        int sum=0;
        while(temp!=0){
            int t=temp%10;
            sum+= (int) Math.pow(t,power);
            temp/=10;

        }
        if(sum==n){
            return true;
        }
        return false;

    }
}
