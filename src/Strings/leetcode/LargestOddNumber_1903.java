package Strings.leetcode;

public class LargestOddNumber_1903 {
    static void main(String[] args) {
//        String str="25";
//        System.out.println(largestOddNumber(str));
        int a=11;
        int b=1;
        System.out.println(a&b);

    }
    static String largestOddNumber(String num) {
        StringBuilder sb=new StringBuilder();

        for(int i=num.length()-1;i>=0;i--)
        {
          int digit=num.charAt(i)-'0';
            if(digit %2!=0){
                 return num.substring(0,i+1);
            }
        }
        return "";
    }
}
