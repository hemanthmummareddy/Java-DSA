package leetcode;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayToFormInteger989 {
    static void main(String[] args) {
        int[] arr={1,2,0,0};
        int k=34;
        System.out.println(addToArrayForm(arr,k));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
            List<Integer> li=new ArrayList<>();
            String str="";
            for(int i=0;i<num.length;i++){
                str+=Integer.toString(num[i]);
            }
            int n=Integer.parseInt(str);
            n+=k;

            String s=Integer.toString(n);
            char[] arr=s.toCharArray();
            for(int i=0;i<arr.length;i++){
                li.add(Character.getNumericValue(arr[i]));
            }


            return li;
    }
}
