package recursion.basics;

public class productOfDigitsOfNumber {
    public static void main(String[] ar){
        int n=143;
        System.out.println("sum of digits numbers is "+sum(n));
    }
    static int sum(int n){
        if(n==0){
            return 1;
        }
        return (n%10)*sum(n/10);
    }
}
