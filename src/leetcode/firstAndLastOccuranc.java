package leetcode;

import java.util.Arrays;

public class firstAndLastOccuranc {
    public static void main(String[] args) {
        firstAndLastOccuranc obj = new firstAndLastOccuranc();
        int[] arr = {5, 7, 7, 8, 7, 9};
        int target = 7;
        int[] pos = obj.searchLastandFirst(arr, target);
        System.out.println(Arrays.toString(pos));
    }

    public int[] searchLastandFirst(int[] arr, int target) {
        int[] ans={-1,-1};
        int start=search(arr,target,true);
        int end=search(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    public int search(int[] arr,int target, boolean searchStartIndex){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            } else if (arr[mid]<target) {
                start=mid+1;
            }
            else{
                ans=mid;
                if(searchStartIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }

        }
        return ans;
    }

}
