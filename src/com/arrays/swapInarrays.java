package com.arrays;

import java.util.Arrays;

public class swapInarrays {
    static void main(String[] args) {
        int[] arr={3,2,5,9,6,2};
        System.out.println("Befor swaping"+ Arrays.toString(arr));
        swap(arr,2,5);
        System.out.println("after swaping"+ Arrays.toString(arr));

    }
    static  void swap(int[] arr,int index1,int index2){
        int t=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=t;
    }
}
