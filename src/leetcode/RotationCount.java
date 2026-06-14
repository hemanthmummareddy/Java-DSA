package leetcode;

public class RotationCount {
    static void main(String[] args) {
        int arr[]={4,5,6,7,1,2,3};

        System.out.println(CountRotation(arr));
    }
    // the roataion count must be the pivot index+1
    /*
    * 1 2 3 4 5 6 7-actual array
    * rotation 1: 7 1 2 3 4 5 6
    * rotation 2: 6 7 1 2 3 4 5
    * rotation 3: 5 6 7 1 2 3 4
    * rotation 4: 4 5 6 7 1 2 3
    * the array is rotated 4 times
    *
    *
    *  the pivot element is 7 index is 3 so the roation count is 3+1
    * */
    private static int CountRotation(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end &&arr[mid]>arr[mid+1]){
                return mid+1;//acutal we need to return mid ->pivot but we are going for pivot+1 so mid+1
            } else if (mid>start && arr[mid]<arr[mid-1]) {
                return mid;//acutal we need to return mid-1 ->pivot but we are going for pivot+1 so mid-1+1=mid
            } else if (arr[start]>=arr[mid]) {
                end=mid-1;

            }else if(arr[start]<=arr[mid]){
                start=mid+1;
            }
        }
        return -1;
    }

}
