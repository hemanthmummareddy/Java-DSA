package recursion.arrays;

public class LinearSearch {
    public static void main(String[] ar){
        int[] arr={-11,-6,1,6};
        int k=7;
        System.out.println(search(arr,k));

    }
    static boolean search(int[] arr,int k){
        return helper(arr,k,0);
    }
    static boolean helper(int[] arr,int k,int i){
        if(i==arr.length){
            return false;
        }
        if(arr[i]==k) return true;
        return  helper(arr,k,i+1);
    }



}
