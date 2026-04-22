package com.arrays;

public class Max {
    public static void main(String[] arg){
        int[] arr={2,5,2,43,642,7,4640};
        System.out.println(maxi(arr));
    }
    static int maxi(int[] arr){
        int m=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]>m){
                m=arr[i];
            }
        }

        return m;
    }
}
