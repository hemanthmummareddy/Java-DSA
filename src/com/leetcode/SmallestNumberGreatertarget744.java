package com.leetcode;

public class SmallestNumberGreatertarget744 {
    static void main(String[] args) {
        char[] arr={'c','f','j'};
        char target='c';
        System.out.println(5&1);
        int i=sGNUmber(arr,target);
        System.out.println(arr[i]);
    }

    private static int sGNUmber(char[] arr, char target) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            } else if (arr[mid]<=target) {
                start=mid+1;
            }

        }
        return start;
    }
}
