package com.searching.binary;

public class sqrtofNUmber {
    public static void main(String[] args){
        int n=2147395599;
        System.out.println(sqrtOfGivenNumber(n));
    }
    static int sqrtOfGivenNumber(int n){
        long start=0;//long is using to handle the long numbers and to avoid the overflow
        long end=n;

        while(start<=end){
            long mid=start+(end-start)/2;
            if(mid*mid==n){
                return (int)mid;
            }
            if(mid*mid>n){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return (int)end;
    }
}
