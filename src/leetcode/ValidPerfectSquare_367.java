package leetcode;

public class ValidPerfectSquare_367 {
    static void main(String[] args) {
        int n=40;
        System.out.println(isPerfectSquare(n));
    }
    static boolean isPerfectSquare(int n) {
        if(n==1){
            return true;
        }
        if (n==2){
            return false;
        }
        int s=0;
        int e=n/2;

        while(s<=e){
            int m=s+(e-s)/2;
            long square=(long)m*m;
            if(square==n){
                return true;

            }
            if(square<n){
                s=m+1;
            }else{
                e=m-1;
            }

        }
        return false;
    }
}
