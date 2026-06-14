package recursion.arrays;

public class sortedOrNot {
    public static void main(String[] ar){
        int[] arr={-11,-6,1,6};
        System.out.println(sort(arr));
    }
    static boolean sort(int[] arr){
        return helper(arr,0);
    }
    static boolean helper(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        return arr[i]<=arr[i+1] && helper(arr,i+1);
    }


}
