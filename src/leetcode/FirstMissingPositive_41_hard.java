package leetcode;

import java.util.Arrays;

class FirstMissingPositive_41_hard {
    static void main(String[] args) {
        int[] arr={4,1,-1,3};
        System.out.println(firstMissingPositive(arr));
        System.out.println(Arrays.toString(arr));
    }
    static int firstMissingPositive(int[] arr) {
        
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if( arr[i] > 0 && arr[i]<=arr.length && arr[i]!=arr[correct]){
                swap(i,correct,arr);
            }
            else{
                i++;
            }
        }
        for( i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                return i+1;
            }

        }
        return arr.length+1;
    }
    static void swap(int i,int j,int arr[]){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }    
}