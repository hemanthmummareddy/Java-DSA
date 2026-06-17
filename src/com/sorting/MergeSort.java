package com.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] ar){
        int[] arr={4,5,2,6,7,1};
        int[] ans=mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergeSort( Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] ans=new int[left.length+right.length];
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                ans[k]=left[i];
                i++;
            }else{
                ans[k]=right[j];
                j++;
            }
            k++;
        }
        // There is chances like not two arrays will add to the answer completely because of the lenght and all so
        //we need to add all those remaing elements properly to the array
        while(i<left.length){
            ans[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            ans[k]=right[j];
            j++;
            k++;
        }
        return ans;
    }


}
