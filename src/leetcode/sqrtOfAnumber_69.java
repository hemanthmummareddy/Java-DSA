package leetcode;

public class sqrtOfAnumber_69 {
    static void main(String[] args) {
        int n=40;
        System.out.println(mySqrt(n));
    }
    static int mySqrt(int n) {
        if (n<2){
            return n;
        }
        int s=0;
        int e=n/2;

        while(s<=e){
            int m=s+(e-s)/2;
            long square=(long)m*m;
            if(square==n){
                return m;

            }
            if(square<n){
                s=m+1;
            }else{
                e=m-1;
            }

        }
        return e;
    }
}
