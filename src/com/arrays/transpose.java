package com.arrays;

import java.util.Arrays;

public class transpose {
    static void main(String[] args) {
        int[][] mat={{1,2,4},{1,5,7}};
        int[][] arr=new int[mat[0].length][mat.length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                arr[j][i]=mat[i][j];
            }
        }
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
