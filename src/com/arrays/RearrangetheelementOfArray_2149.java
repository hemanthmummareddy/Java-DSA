package com.arrays;

import java.util.Arrays;

public class RearrangetheelementOfArray_2149 {
    static void main(String[] args) {
        int arr[]={3,1,-2,-5,2,-4};
//        reArrange(arr);
        System.out.println(Arrays.toString(reArrange(arr)));
    }

    private static int[] reArrange(int[] arr) {
        int n=arr.length;
//        int[] p=new int[n/2];
//        int[] q=new int[n/2];
//        int i1=0,i2=0;
//        for(int i=0;i<n;i++){
//            if(arr[i]>0){
//                p[i1]=arr[i];
//                i1++;
//            }
//            else{
//                q[i2]=arr[i];
//                i2++;
//            }
//        }
//        int j=0;
//        for(int i=0;i<n/2;i++){
//            arr[j]=p[i];
//            arr[j+1]=q[i];
//            j+=2;
//        }
        int ans[]=new int[n];
        int pos=0;
        int neg=1;
        for(int num:arr){
            if(num>0){
                ans[pos]=num;
                pos+=2;
            }
            else{
                ans[neg]=num;
                neg+=2;
            }
        }
        return ans;
    }
}
