package recursion.basics;

public class ProductOfNUmberNto1 {
    public static void main(String[] ar){
        int n=10;
        System.out.println("product of numbers form n to 1 is "+pro(n));
    }
    static int pro(int n){
        if(n<=1){
            return 1;
        }
        return n*pro(n-1);
    }

}
