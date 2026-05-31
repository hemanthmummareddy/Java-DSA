package recursion.basics;

public class SumOFDigitsOfNumber {
    public static void main(String[] ar){
        int n=1430;
        System.out.println("sum of digits numbers is "+sum(n));
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return n%10+sum(n/10);
    }
}
