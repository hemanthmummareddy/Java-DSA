package com.leetcode;


import java.util.Arrays;

public class PlusOne_66 {
    static void main(String[] args) {
        int[] arr={9,9};
        System.out.println(Arrays.toString(addingOne(arr)));

    }
    static int[] addingOne(int[] digits){
        for(int i=digits.length-1;i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] r=new int[digits.length+1];
        r[0]=1;
        return r;
    }
}
