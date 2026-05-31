package recursion.basics;

public class revereseANumber {
    public static void main(String[] ar){
        int n=324;
        rev1(n);
        System.out.println(sum);
        System.out.println(rev2(-143));
    }
    static int sum=0;// we will use this varible to update the reversed value
    static void rev1(int n){
        if(n==0){
            return;

        }
        sum=sum*10+n%10;
        rev1(n/10);
    }
    static int rev2(int n){
        int digit=(int)(Math.log10(Math.abs(n)))+1;
        System.out.println(digit);
        return helper(n,digit);
    }
    static int helper(int n,int digit){
        if(n%10==n){
            return n;
        }
        return n%10 * (int)(Math.pow(10,digit-1))+helper(n/10,digit-1);
    }

}
