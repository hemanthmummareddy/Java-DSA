package Strings.leetcode;

public class ValidPalindrome_125 {
    static void main(String[] args) {
        String s= " ";
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String s) {
        String str=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>96 && str.charAt(i)<124){
                sb.append(str.charAt(i));
            }
        }
        String st=sb.toString();
        System.out.println(st);
        return st.equals(sb.reverse().toString());
    }
}
