class Solution {   
    public boolean rotateString(String s, String goal) {
        //your code goes here
        StringBuilder str=new StringBuilder();
        str.append(s);
        for(int i=0;i<s.length();i++){
            if(str.toString().isequal(goal)){
                return true;
            }
            char a=str.charAt(i);
            str.deleteCharAt(0);
            str.append(a);

        }
        return false;
    }
}