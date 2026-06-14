package leetcode;
import java.util.*;
public class medianOfTwoSortedArrays_4 {
    public static void main(String[] args){
    int[] nums1={1,2};
    int[] nums2={3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            arr.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            arr.add(nums2[i]);
        }
        Collections.sort(arr);
        if(arr.size()%2==0){
            return (double) ((arr.get(arr.size()/2-1)) +(arr.get(arr.size() / 2))) /2;
        }
        else{
            return arr.get(arr.size()/2);
        }
    }
}
