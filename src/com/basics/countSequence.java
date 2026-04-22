package com.basics;

import java.util.Scanner;

public class countSequence {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n= sc.nextInt();
        System.out.print("Enter the number you want to count :");
        int k=sc.nextInt();
        int count=0;
//        while(n>0){
//            int r=n%10;
//            if (r==k){
//                count ++;
//            }
//            n=n/10;
//        }
//        if (count>0){
//            System.out.println(k + " repeated " + count+" Times in the given number " );
//        }
        String t= Integer.toString(n);
//        String t="";
//        System.out.print(t);
        String f=Integer.toString(k);

        for(int i=0;i<t.length();i++){
//            System.out.println(t.charAt(i));
            if (t.charAt(i) == f.charAt(0)){

                count++;
            }
//            else{
//                System.out.println("Not");
//            }
        }
        if (count>0){
            System.out.println(k + " repeated " + count+" Times in the given number " );
        }

    }
}
