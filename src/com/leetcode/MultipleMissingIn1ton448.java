package com.leetcode;

import java.util.*;


public class MultipleMissingIn1ton448 {
    public static void main(String[] ar){
        int[] arr={4,3,2,7,8,2,3,1};
        System.out.println(missingN(arr));
    }
    static List<Integer> missingN(int[] arr){
        ArrayList<Integer> miss=new ArrayList<>();
        int i=0;
        int n=arr.length;
        while(i<arr.length){
            int correct_i=arr[i]-1;
            if(arr[i]!=arr[correct_i]){
                swap(i,correct_i,arr);
                System.out.println("swapped");
            }
            else
                i++;
        }
        System.out.println(Arrays.toString(arr));
        for( i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                miss.add(i+1);
            }

        }
        return miss;
    }
    static void swap(int i,int j,int arr[]){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}
