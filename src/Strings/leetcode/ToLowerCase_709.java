package Strings.leetcode;

import java.nio.MappedByteBuffer;

public class ToLowerCase_709 {
    static void main(String[] args) {
        String s="Hello";
        System.out.println(toLowerCase(s));
    }
    static String toLowerCase(String s) {
        // return s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int a=(s.charAt(i));
            if(a<97){
                sb.append((char)(a+32));
            }else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
