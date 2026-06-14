package leetcode;

import java.util.ArrayList;
import java.util.List;

public class luckyNumberInArray1380 {
    public static void main(String[] args){
        int[][] arr={{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        System.out.println(luckyNumbers(arr));

    }

    public static  List<Integer> luckyNumbers(int[][] arr) {
        List<Integer> ln=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            int min=arr[i][0];
            int c_index=0;

            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] <min){
                    min=arr[i][j];
                    c_index=j;
                }

            }
            boolean isLucky=true;
            for(int j=0;j<arr.length;j++){
                if(arr[j][c_index]>min){
                    isLucky=false;
                    break;
                }
            }


            if(isLucky){
                ln.add(min);
                return ln;
            }
        }
        return ln;
    }

}
