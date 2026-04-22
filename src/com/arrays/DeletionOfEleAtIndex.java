package com.arrays;
import java.util.*;
public class DeletionOfEleAtIndex {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList <Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        int ele=sc.nextInt();
//        System.out.println(a.size());
        for(int i=0;i<a.size();i++){
            if(a.get(i)==ele){
                a.remove(i);
            }
        }
        System.out.println(a);

    }

}
