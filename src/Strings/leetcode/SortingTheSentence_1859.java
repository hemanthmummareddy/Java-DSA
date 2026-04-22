package Strings.leetcode;

import java.util.Arrays;

public class SortingTheSentence_1859 {
    static void main(String[] args) {
        String s= "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));

    }
    static String sortSentence(String s) {
//        System.out.println(Arrays.toString((s.split("\\ "))));
        String[] StrArray=s.split(" ");
        String[] result=new String[StrArray.length];
        StringBuilder sb=new StringBuilder();

        for(String str:StrArray){
            int i=str.charAt(str.length()-1)- '1';

            result[i]=str.substring(0,str.length()-1);

//            System.out.println(result[i]);

        }
//        System.out.println(StrArray.length);
//        System.out.println(Arrays.toString(result));
        for(int i=0;i<result.length;i++){
            sb.append(result[i]);
            if(i!=result.length-1)
                sb.append(" ");
        }
        return sb.toString();
    }
}
