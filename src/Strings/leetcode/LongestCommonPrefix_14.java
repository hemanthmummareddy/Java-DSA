package Strings.leetcode;

import java.security.PrivilegedExceptionAction;

public class LongestCommonPrefix_14 {
    static void main(String[] args) {
        String[] str={"flowers","fight","flow"};
        System.out.println(longestCommonPrefix(str));
    }
    static String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<strs[0].length();i++){
            char ch=strs[0].charAt(i);
            boolean isPre=true;
            for(int j=1;j< strs.length;j++){
                if(strs[j].charAt(i)!=ch){
                    isPre=false;
                    break;
                }
            }
            if(isPre){
                sb.append(ch);
            }
            else{
                break;
            }
        }
        return sb.toString();
    }

}
