package Strings.leetcode;

class rotationOfString {
    static void main(String[] args) {
        String s1= "abcde";
        String s2= "cdeab";
        System.out.println(rotateString(s1,s2));
    }
    public static boolean rotateString(String s, String goal) {
        //your code goes here
        StringBuilder str=new StringBuilder();
        str.append(s);
        for(int i=0;i<s.length();i++){
            if(goal.equals(str.toString())){
                return true;
            }
            char a=str.charAt(0);
            str.deleteCharAt(0);
            str.append(a);

        }
        return false;
    }
}