package Strings.leetcode;

public class CanBeEqualWithIOperations_2839 {
    static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";
        System.out.println(canBeEqual(s1,s2));
    }
    static boolean canBeEqual(String s1, String s2) {
        boolean evensMatch =
                (s1.charAt(0) == s2.charAt(0) && s1.charAt(2) == s2.charAt(2)) ||
                        (s1.charAt(0) == s2.charAt(2) && s1.charAt(2) == s2.charAt(0));
        boolean oddsMatch =
                (s1.charAt(1) == s2.charAt(1) && s1.charAt(3) == s2.charAt(3)) ||
                        (s1.charAt(1) == s2.charAt(3) && s1.charAt(3) == s2.charAt(1));

        return evensMatch && oddsMatch;
    }
}
