package com.leetcode;

import java.util.Arrays;

public class TargetInInfiniteSortedArray {
    static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,12,13,15,16,18,19,30};
        int target=200;

        System.out.println(answer(arr,target));

    }
    static int answer(int[] arr,int target){

        int start=0,end=1;
        // this code might give us error like if the element is greater then the highest number in the array so we need to use exceptions
//        try{
//            while(target>arr[end]){
//                int temp=end+1;
//                end=end+(end-start+1)*2;
//                start=temp;
//
//            }
//        }catch (ArrayIndexOutOfBoundsException e){
//            return -1;
//        }
//        we need to go with the exception to handel this
        while (true){
            try{
                if(target > arr[end]){
                    int newStart=end+1;
                    end=end+(end-start+1)*2;
                    start=newStart;
                }else{
                    break;
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                break;
            }

        }
        return BinarySearch(arr,target,start,end);
    }
    static int BinarySearch(int[] arr, int target,int start,int end) {


        while(start<=end)
        {
            int mid=start+(end-start)/2;
            try {
                if (arr[mid] == target)
                    return mid;
                if (arr[mid] < target)
                    start = mid + 1;
                else if (arr[mid] > target)
                    end = mid - 1;
            }catch(Exception e){
                end=mid-1;
            }
        }
        return -1;
    }
}
