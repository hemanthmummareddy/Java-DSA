package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class slidingWindowMax_239 {
    static void main(String[] args) {
        int[] nums={1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maximum(nums,3)));
    }

    private static int[] maximum(int[] nums, int k) {
        ArrayList<Integer> res=new ArrayList<>();
        int l=0;
        int r=k-1;
        while(r<nums.length){
            int max=nums[l];
            for(int i=l;i<=r;i++){
                max=Math.max(max,nums[i]);

            }
            res.add(max);
            l++;
            r++;
        }


        int[] out=new int[res.size()];
        for(int i=0;i<res.size();i++){
            out[i]=res.get(i);
        }
        return out;
    }
}
