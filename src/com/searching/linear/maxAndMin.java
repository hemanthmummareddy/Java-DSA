package com.searching.linear;

import java.util.Arrays;

public class maxAndMin {
    static void main(String[] args) {
//        int[][] arr={
//                {1,2,3},{4,5,6,7},{8,9}
//        };
//        System.out.println("Maximu value is"+max(arr));
//        System.out.println("Minimum value is "+min(arr));
        int[] nums={121,32,53322,654};
        Arrays.sort(nums);
        System.out.print(Arrays.toString(nums));

        String s= Arrays.toString(nums);

        for(int i=0;i<s.length();i++){

        }
    }
   static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        return max;
   }
    static int min(int[][] arr){
        int max=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]<max){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
}
