package leetcode;

public class ReversePairs_493 {
    public static void main(String[] args){
        int[] nums={2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        System.out.println(reversePairs(nums));
    }
    public static int reversePairs(int[] nums) {
        int pairs=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j])
                    pairs=0;
                else if(nums[i]>2*nums[j])
                    pairs++;
            }
        }
        return pairs;
    }
}
