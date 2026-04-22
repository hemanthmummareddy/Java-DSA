package com.basics;

import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("enter the operation do you want to perform(+,-,*,/,%): ");
            char op=sc.next().trim().charAt(0);

            if (op =='+' || op=='-' || op=='*' || op=='/' || op=='%'){
                System.out.print("enter values to perform operation: ");
                int a=sc.nextInt();
                int b=sc.nextInt();
                if (op == '+'){
                    System.out.println((a+b));
                }
                else if (op =='-')
                    System.out.println(a-b);
                else if (op == '*')
                    System.out.println(a*b);
                else if (op == '%')
                    System.out.println(a%b);
                else if (op== '/')
                    System.out.println(a/b);
                else {
                    System.out.println("sorry enter another values");
                    continue;
                }
            }
            else if (op == 'x' || op =='X'){
                System.out.println("tq");
                break;
            }
            else {
                System.out.println("Enter valid operator");

            }
        }
    }
}
