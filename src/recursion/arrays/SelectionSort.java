package recursion.arrays;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] arg){
        int[] arr={2,3,1,5};
        System.out.println(Arrays.toString(arr));
        select(arr,0,arr.length-1,0);
        System.out.println(Arrays.toString(arr));

    }
    static void select(int[] arr,int start,int end,int m){
        if(end<=0)
            return;
        if(start<=end){
            if(arr[start]>arr[m]){
                m=start;
            }
            select(arr,start+1,end,m);
        }
        else {
            if(arr[m]!=arr[end]){
                int t=arr[m];
                arr[m]=arr[end];
                arr[end]=t;
            }
            select(arr,0,end-1,0);
        }
    }

}
