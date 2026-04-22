package Strings.leetcode;

public class slidingWindow {
    static void main(String[] args) {
        String str="Bytexlrocksbytexlbytexl";
        String t="bytexl";
        str=str.toLowerCase();
        t=t.toLowerCase();
        int count=0;
        int k=6;
        for(int i=0;i<str.length()-k+1;i++){
            if(str.substring(i,i+k).equals(t)){
                count++;
            }
        }
        System.out.println(count);
    }
}
