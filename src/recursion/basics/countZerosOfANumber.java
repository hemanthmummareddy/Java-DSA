package recursion.basics;

public class countZerosOfANumber {
    public static void main(String[] args){
        int n=-230000000;
        zeros(n);
        System.out.println(count);
        System.out.println("zeros in n are "+countZeros(n));
    }
    static int count=0;
    static void zeros(int n){
        if(n==0) return;
        if(n%10==0) count+=1;
        zeros(n/10);
    }
    static int countZeros(int n){
        return helper(n,0);
    }
    static int helper(int n,int count){
        if(n==0)
            return count;
        if(n%10==0){
            return helper(n/10,count+1);
        }
        else{
           return helper(n/10,count);
        }
    }


}
