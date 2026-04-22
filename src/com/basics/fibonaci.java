package com.basics;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class fibonaci {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(0+" "+1 +" ");
        int i=2,a=0,b=1;
        while(b<=n){
            int s=b;
            b=a+b;
            a=s;
            System.out.print(b+" ");
//           i+=1;
        }
    }
}
