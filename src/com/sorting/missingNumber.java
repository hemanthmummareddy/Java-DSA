package com.sorting;

public class missingNumber {
    public static void main(String[] ar){
        int[] arr={4,0,2,1};
        System.out.println(missingN(arr));
    }
    static int missingN(int[] arr){
        int i=0;
        int n=arr.length;
        while(i<arr.length){
            int correct_i=arr[i];
            if(arr[i]==n){
                i++;
                continue;
            }
            if(arr[i]!=arr[correct_i]){
                swap(i,correct_i,arr);
            }
            else
                i++;
        }
        for( i=0;i<arr.length;i++){
            if(arr[i]!=i){
                return i;
            }

        }
        return n;
    }
    static void swap(int i,int j,int arr[]){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}
