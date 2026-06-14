package leetcode;

public class peakElementInMountainArray {
    static void main(String[] args) {
        int arr[]={1,2,3,5,7,8,9,1};
        System.out.println(PeakElement(arr));
    }

    private static int PeakElement(int[] arr) {
        int start=0;
        int end=arr.length-1;
        //for a gauranted mountain
//        while(start<=end){
//            int mid=start+(end-start)/2;
//            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
//                return mid;
//            else if(arr[mid]<arr[mid+1]){
//                start=mid+1;
//            }
//            else{
//                end=mid;
//            }
//        }
//        return -1;
        //Another way
        while(start!=end){
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

}
