package com.leetcode;

import java.util.Arrays;

public class DuplicateNumberINArray1toN287 {
    public static void main(String[] ar){
        int[] arr={1,1,1,1,1};
        System.out.println(missingN(arr));
    }
    static int missingN(int[] arr){
        int i=0;
        int n=arr.length;
        while(i<arr.length){
            int correct_i=arr[i]-1;
//            if(arr[i]==n){
//                i++;
//                continue;
//            }
            if( arr[i]<arr.length && arr[i]!=arr[correct_i]){
                swap(i,correct_i,arr);
            }
            else
                i++;
        }
        System.out.println(Arrays.toString(arr));
        for( i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                return arr[i];
            }

        }
        return -1;
    }
    static void swap(int i,int j,int arr[]){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }

}
