package recursion.basics;

public class sumFromNto1 {
    public static void main(String[] ar){
        int n=5;
        System.out.println("sum of numbers form n to 1 is "+sum(n));
    }
    static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
}
