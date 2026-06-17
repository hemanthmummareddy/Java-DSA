package leetcode;

import java.util.*;

public class SetMatrixZeros_73 {
    public static void main(String[] ar){
        int[][] arr={
                {1,1,1},{1,0,1},{1,0,1}
        };
        zeros(arr);
        for(int[] nums:arr){
            System.out.print(Arrays.toString(nums));
        }
    }
    public static void zeros(int[][] arr){
        ArrayList<ArrayList<Integer>> zero=new ArrayList<>();
        int index=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==0){
                    ArrayList<Integer> a=new ArrayList<>();
                    a.add(i);
                    a.add(j);
                    zero.add(index,a);
                    index++;
                }
            }
        }
        for(int i=0;i<index;i++){
            int row=zero.get(i).get(0);
            int col=zero.get(i).get(1);
            Arrays.fill(arr[row], 0);
            for(int j=0;j<arr.length;j++){
                arr[j][col]=0;
            }
        }
        System.out.println(zero);
    }
}
