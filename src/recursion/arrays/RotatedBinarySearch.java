package recursion.arrays;

public class RotatedBinarySearch {
    public static void main(String[] ar){
        int[] arr={5,6,7,8,1,2,3};
        int key=2;
        System.out.println(search(arr,key,0,arr.length-1));
    }
    static int search(int[] arr,int key,int s,int e){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==key)
            return mid;
        if(arr[s]<=arr[mid]){
            if(key>=arr[s]&&key<=arr[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        else{
            if(key>=arr[mid]&&key<=arr[e]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return search(arr,key,s,e);
    }
}
