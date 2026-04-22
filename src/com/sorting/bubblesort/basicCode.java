package com.sorting.bubblesort;

import java.util.Arrays;

public class basicCode {
    public static void main(String arg[]){
        int[] arr={-32,-1,4,5,-99,-200 };
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                    c++;
                }
                System.out.println("inneer");
            }
            if(c==0){
                return;
            }
            System.out.println("outer");
        }
    }
}
