package com.searching.linear;

public class searchInString {
    static void main(String[] args) {
        String str="Hello Reddy";
        char tar='b';

        int index=search(str,tar);
        if(index>0) {
            System.out.println("The given target charcter is present at the index" + index);

        }
        else{
            System.out.println("cannot able to find the target character");
        }
    }
    static int search(String str,char tar){
        int len=str.length();
        if(len==0)
            return -1;
        for(int i=0;i<len;i++){
            if(str.charAt(i)==tar){
                return i;

            }
        }
        return -1;
    }
}
