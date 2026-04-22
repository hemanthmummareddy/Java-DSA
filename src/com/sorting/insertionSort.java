package com.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class insertionSort {
    static void main(String[] args) {
        int[] arr={3,4,2,5};
        System.out.println(Arrays.toString(arr));
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int t=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=t;
                }
                else break;
            }
        }
    }
}
