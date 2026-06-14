package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_sum_15 {
    public static void main(String[] args){
        int[] arr={-1,0,1,2,-1,-4};
        List<List<Integer>> list=new ArrayList<>();
        list=threesum(arr);
        System.out.println(threeSumOptimized(arr));

    }
    static List<List<Integer>>  threesum(int[]arr){
        List<List<Integer>> list=new ArrayList<>();
        int start=0;
        int end=2;
        while(end<arr.length){
            int sum=0;
            int i=start;
            while(i<=end){
                sum+=arr[i];
                i++;
            }
            i=start;
            if(sum==0){
                ArrayList<Integer> li=new ArrayList<>();
                while (i<=end){
                    li.add(arr[i]);
                    i++;
                }
                list.add(li);
            }
            start++;
            end++;
        }
        return list;
    }
    static List<List<Integer>> threeSumOptimized(int[] arr) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            int left = i + 1, right = arr.length - 1;
            while (left < right) {
                int sum = arr[i] + arr[right] + arr[left];
                if (sum == 0) {
                    list.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;
                    while (left < right && arr[left] == arr[left - 1]) left++;
                    while (left < right && arr[right] == arr[right + 1]) right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return list;
    }
}
