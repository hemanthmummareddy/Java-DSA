package com.sorting;

import java.util.Arrays;

public class basicCodes {
    public static void main(String arg[]){
        int[] arr={5 ,4 ,4 ,1 ,1};
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);
        System.out.println("Bubble sort");
        System.out.println(Arrays.toString(arr));
        System.out.println("insertion sort");
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("selection sort");
        selectionSort(arr);
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
            }
            if(c==0){
                return;
            }

        }
    }
    static void insertionSort(int[] arr){
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
    static void selectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            if(min_index==i){
                break;
            }
            else{
                swap(i,min_index,arr);
            }
        }
    }
    static void swap(int i,int j,int arr[]){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }

}
