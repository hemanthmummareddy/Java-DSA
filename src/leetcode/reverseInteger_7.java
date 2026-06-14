package leetcode;

class reverseInteger_7 {
    static void main(String[] args) {
        int n=1534236469;
        System.out.println(reverse(n));
    }
    static int reverse(int x) {
        long n=x;
        long r=0,s=0;
        while(n!=0){
            s=n%10;
            r=r*10+s;
            n=n/10;

        }
        System.out.println(r);
        return (int)r;
    }
}