package Maths;

import java.util.Arrays;

public class NonRepeatedElement {
    public static void main(String[] ars){
        int[] arr={1,0,4,5,1,5,0};
        System.out.println(ans(arr));

    }
    static int ans(int[] arr){
        int unique=0;
        for(int n:arr){
            unique^=n;
        }
        return unique;
    }
}
