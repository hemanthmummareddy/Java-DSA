package leetcode;

public class MaxConsuctiveOnes_485 {
    public static void main(String[] ars){
        int[] arr={1,0,1,1,0,1};
        System.out.println(consuctiveOnes(arr));
        System.out.println(consuctiveOnes2Optimezed(arr));
    }
    static int consuctiveOnes(int[] arr){
        int total=0;
        for(int i=0;i<arr.length;i++ ){
            int ones=0;
            int j=i;
            while(j<arr.length && arr[j]!=0){
                ones++;
                j++;
            }
            if(ones>total){
                total=ones;
            }

        }
        return total;
    }
    static int consuctiveOnes2Optimezed(int[] arr){
        int max=0;
        int c=0;
        for(int n:arr){
            c=(n==1)?++c:0;
            if(c>max){
                max=c;
            }
        }
        return max;
    }

}
