package Strings.leetcode;

import java.lang.ref.SoftReference;

public class NoOfStrigsAppearAsSubStringa_1967 {
    static void main(String[] args) {
        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";
        System.out.println(word.substring(0,3));
        StringBuilder sb=new StringBuilder();
        System.out.println(numOfStrings(patterns,word));
    }
    static int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(int i=0;i<patterns.length;i++){
            if(word.contains(patterns[i])){
                count++;
            }
        }
        return count;
    }
}
