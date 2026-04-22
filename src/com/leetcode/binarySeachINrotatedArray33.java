package com.leetcode;

public class binarySeachINrotatedArray33 {
    static void main(String[] args) {
        int arr[]={4,5,6,7,1,2,3};
        int target=1;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target){
        int pivot=PivotElement(arr);
        if (pivot == -1) {
            return BinarySearch(arr,target,0, arr.length-1);
        }
        if(arr[pivot]==target){
            return pivot;
        }
        if(target>=arr[0]){
            return BinarySearch(arr,target,0,pivot-1);
        }
        if(target<=arr[0])
            return BinarySearch(arr,target,pivot+1,arr.length-1);

        return -1;
    }

    private static int PivotElement(int[] arr) {
        int start=0;
        int end=arr.length-1;
//        int piv=-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mid<end  && arr[mid]>arr[mid+1] ) {
                //beacuse you are in the ascending part of the array
                //the mid it self is might be ans so end!=mid-1
                return mid;
            }else if(mid>start &&arr[mid]<arr[mid-1] )
                return mid-1;
            else if(arr[start]>=arr[mid]){
                //you are in the descending part  of the array
                end=mid-1;
            }else if(arr[start]<=arr[mid]){
                start=mid+1 ;
            }

        }
        //if both are equal there might be only one element is left accoding to the checks done right yet
        // so the start or end is might be the peak element
        return start;

    }
    private static int BinarySearch(int[] arr,int target,int start,int end) {

        //        boolean isAsc= arr[start]<arr[end];

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target)
                start=mid+1;
            else
                end=mid-1;

        }
        return -1;
    }
}
