package com.leetcode;

import java.util.Arrays;

public class leftRotationOfArray {
    static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int d=2;
        System.out.println(Arrays.toString(leftRotation(arr,d)));
    }

    private static int[] leftRotation(int[] arr, int d) {
        int n=arr.length;
        int[] temp=new int[n];
        int t=d;
        for(int i=0;i<d;i++){
            temp[n-t]=arr[i];
            t--;
        }
        int index=0;
        for(int i=d-1;i<n;i++){
            if(index<i){
                temp[index]=arr[i];
                index++;
            }
        }

        return temp;
    }
}
