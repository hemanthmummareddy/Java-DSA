package Strings.leetcode;

public class FirstOccuranceOf_28 {
    static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sbad";
        System.out.println(strStr(haystack,needle));
        String name = "alex";
        String typed = "aaleex";

    }
    static int strStr(String haystack, String needle) {

        return haystack.indexOf(needle);
    }
//    static boolean isLongPressedName(String name, String typed) {
//
//    }
}
