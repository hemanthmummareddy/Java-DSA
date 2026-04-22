package com.arrays;

import java.util.Arrays;

public class ProductOfReminingElements {
    static void main(String[] args) {
        int[] nums={1,2,3,4};
        int n=nums.length;
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            int pr=1; 
            for(int j=0;j<n;j++){
               if(i==j)
                   continue;
               else
                pr+=pr*nums[j];
            }
            arr[i]=pr;
        }
        System.out.println(Arrays.toString(arr));

    }
}
