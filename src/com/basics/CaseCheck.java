package com.basics;
import java.util.*;
public class CaseCheck {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char ch=sc.next().trim().charAt(0);

        if (ch>=97 && ch<=122){
            System.out.print("Lower case");
        }
        else if (ch>=65 && ch<=87){
            System.out.println("Upper case");
        }
    }
}
