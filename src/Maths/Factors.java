package Maths;

import java.util.ArrayList;

public class Factors {
    static void main(String[] args) {
        factor1(36);
        optimizedFactor(36);
        optimizedFactorInSequence(36);
    }
    static void factor1(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0)
                System.out.print(i+" ");
        }
        System.out.println();
        //op:1 2 3 4 6 9 12 18 36
    }
    //time complexity:O(sqrt(n))
    static void optimizedFactor(int n){
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(n/i==i){//to avoid duplicates of a perfect square roots ex : 36 , if you wont apply this then it will print 6 twice
                    System.out.print(i+" ");
                    continue;
                }
                System.out.print(i+" "+n/i+" ");
            }

        }
        System.out.println();
        //o/p: 1 36 2 18 3 12 4 9 6
        // those are not on the sequence of order
    }
    //time complexity:O(sqrt(n))
    static void optimizedFactorInSequence(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {//to avoid duplicates of a perfect square roots ex : 36 , if you wont apply this then it will print 6 twice
                    System.out.print(i + " ");
                    continue;
                }
                System.out.print(i + " " );
                list.add(n/i);
            }

        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        //o/p:1 2 3 4 6 9 12 18 36
    }
}
