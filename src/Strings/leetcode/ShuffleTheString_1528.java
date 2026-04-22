package Strings.leetcode;

import java.util.Arrays;

public class ShuffleTheString_1528 {
    public static void main(String[] ar){
        String s="codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indices).toString());
    }
    static String restoreString(String s, int[] indices) {
        char[] arr=new char[indices.length];
        for(int i=0;i<indices.length;i++){
            arr[indices[i]]=s.charAt(i);
        }
        return new String(arr);
    }

}
