package leetcode;

public class findInMountainArray1095 {
    static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=1;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target){
        int peak=PeakElement(arr);
        int firstTry=OrderAgnosticBinary(arr,target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        int lastTry=OrderAgnosticBinary(arr,target,peak,arr.length-1);
        if(lastTry!=-1)
            return lastTry;
        return -1;
    }

    private static int PeakElement(int[] arr) {
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1] ) {
                //beacuse you are in the ascending part of the array
                //the mid it self is might be ans so end!=mid-1
                end=mid;
            }
            else if(arr[mid]<arr[mid+1]){
                //you are in the descending part  of the array
                start=mid+1;
            }

        }
        //if both are equal there might be only one element is left accoding to the checks done right yet
        // so the start or end is might be the peak element
        return start;

    }
    private static int OrderAgnosticBinary(int[] arr,int target,int start,int end) {

        boolean isAsc= arr[start]<arr[end];

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return mid;
            if(isAsc){
                if(arr[mid]<target)
                    start=mid+1;
                else
                    end=mid-1;
            }
            else{
                if(arr[mid]<target)
                    end=mid-1;
                else
                    start=mid+1;
            }
        }
        return -1;
    }

}
