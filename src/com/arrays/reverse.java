package com.arrays;

import java.util.Arrays;

public class reverse {
    static void main(String[] args) {
////        int arr[]={1,2,3,4,5,6,7};
////        System.out.println("Befor swaping"+ Arrays.toString(arr));
////        reverse(arr);
////        System.out.println("After swaping"+ Arrays.toString(arr));
//
//        }
    }
    static void reverse(int[] arr){
        int n=arr.length-1;
        int i=0;
        while(i<n){
            int t=arr[i];
            arr[i]=arr[n];
            arr[n]=t;
            i++;
            n--;
        }
    }
}
