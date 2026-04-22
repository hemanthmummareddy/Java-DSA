package com.sorting;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String arg[]){
        int[] arr={3,4,1,5,2 };
        System.out.println(Arrays.toString(arr));
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cycleSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct_i=arr[i]-1;
            if(arr[i]!=arr[correct_i]){
                swap(i,correct_i,arr);
            }
            else{
                i++;
            }

        }
    }
    static void swap(int i,int j,int arr[]){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }

}
