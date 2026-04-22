package com.searching.binary;

import java.util.Arrays;
import java.util.Collections;

public class basicBinary {
    public static void main(String ar[]){
        int[] arr={1,3,5,6,43,62,564,22};
        int target=300;
        int in=bSearch(arr,target);
        System.out.println(arr[in]);
//        System.out.println("Indexx in Ascending sorted arrray is"+arr(bSearch(arr,target)));
//        System.out.println("Index in descending sorted arrray is"+desBSearch(arr,target));
    }

    private static int desBSearch(int[] arr, int target) {
        Arrays.sort(arr);
        int n=arr.length-1;
        for(int i=0;i< arr.length/2;i++){
            int t=arr[i];
            arr[i]=arr[n];
            arr[n]=t;
            n--;
        }
        System.out.println("descending sorted array "+Arrays.toString(arr));
        int start=0,end=n-1,mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;

            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return start;
    };

    static int bSearch(int[] arr,int target){
//        Arrays.sort(arr);
        int start=0;
        int end=arr.length-1;
//        System.out.println("Acending sorted array "+Arrays.toString(arr));
        while(start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]<target) {
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]==target){
                return mid;
            }

        }
//        System.out.println("element is not found");
    return start;
    }

}
