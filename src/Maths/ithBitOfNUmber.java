package Maths;

public class ithBitOfNUmber {
    static void main(String[] args) {
        int n=5;
        System.out.println(ithBit(n,200));
        System.out.println(setIthbit(n,2));
    }
    static int ithBit(int n,int k){
        return n&(1<<k-1);
    }
    static int setIthbit(int n,int k){
        return n|(1<<k-1);
    }
}
