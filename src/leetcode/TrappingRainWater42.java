package leetcode;

public class TrappingRainWater42 {
    static void main(String[] args) {
        int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }
    static int trap(int[] arr){
        int res=0;
        for(int i=1;i<arr.length-1;i++){
            int lb=arr[i];
            for(int j=0;j<i;j++){
                lb=Math.max(lb,arr[j]);
            }
            int rb=arr[i];
            for(int j=i+1;j<arr.length;j++){
                rb=Math.max(rb,arr[j]);
            }
            int wl=Math.min(lb,rb);
            res+=wl-arr[i];
        }
        return res;
    }
    public int trap2(int[] arr) {
        int[] prefix=new int[arr.length];
        int[] suffix=new int[arr.length];
        prefix[0]=arr[0];
        for(int j=1;j<arr.length;j++){
            prefix[j]=Math.max(prefix[j-1],arr[j]);
        }
        suffix[arr.length-1]=arr[arr.length-1];
        for(int j=arr.length-2;j>=0;j--){
            suffix[j]=Math.max(suffix[j+1],arr[j]);
        }
        int res=0;

        for(int i=1;i<arr.length-1;i++){

             int lb=prefix[i];

            int rb=suffix[i];

            int wl=Math.min(lb,rb);
            res+=wl-arr[i];
        }
        return res;
    }
    public int trap3(int[] arr) {

        int[] suffix=new int[arr.length];

        suffix[arr.length-1]=arr[arr.length-1];
        for(int j=arr.length-2;j>=0;j--){
            suffix[j]=Math.max(suffix[j+1],arr[j]);
        }
        int res=0;
        int leftmax=arr[0];
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>leftmax){
                leftmax=arr[i];
            }
            int lb=leftmax;
            // int lb=prefix[i];

            int rb=suffix[i];

            int wl=Math.min(lb,rb);
            res+=wl-arr[i];
        }
        return res;
    }

}
