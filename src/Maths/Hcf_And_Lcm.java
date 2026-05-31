package Maths;

public class Hcf_And_Lcm {
    static void main(String[] args) {
//        System.out.println(hcf(3,18));
    /*   int[] nums={7,5,6,8,3};
//        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[0];
        for(int num:nums){
            min=Math.min(min,num);
            max=Math.max(max,num);
        }

     */
        System.out.println(hcf(3,18));
        System.out.println(hcfEuclidean(3,19));
        System.out.println(hcfEuclidianRecurrsion(3,18));
        System.out.println(lcm(3,7));
    }
    //time complexity:O(min(a,b)
    static int hcf(int a,int b){
        int h=1;
        for(int i=1;i<=Math.min(a,b);i++)
            if(a%i==0 && b%i==0)
                h=i;
        return h;
    }
    static int hcfEuclidean(int a, int b){
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
    static int hcfEuclidianRecurrsion(int a,int b) {
        if(a==0){
            return b;
        }
        return hcfEuclidianRecurrsion(b%a,a);
    }
    static int lcm(int a,int b){
        return (a*b)/hcfEuclidean(a,b);
    }

}
