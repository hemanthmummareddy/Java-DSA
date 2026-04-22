package com.searching.binary;

public class AgnosticBinarySearch {
    public static void main(String ar[]) {
        int[] arr = {564, 62, 43, 22, 6, 5, 3, 1};
        int target = 62;
        System.out.println("Index of target element in agnostic binary seach is "+AgBinary(arr,target));
    }

    private static int AgBinary(int[] arr, int target) {
        int start=0,end=arr.length-1,mid=0;

        boolean isAsc= arr[start]<arr[end];
        System.out.println(isAsc);
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==target)
                return mid;
            if(isAsc){
                if(arr[mid]<target)
                    start=mid+1;
                else
                    end=mid-1;
            }
            else{
                if(arr[mid]<target)
                    end=mid-1;
                else
                    start=mid+1;
            }
        }
        return -1;
    }
}
