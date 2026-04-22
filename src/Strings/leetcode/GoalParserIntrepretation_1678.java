package Strings.leetcode;

public class GoalParserIntrepretation_1678 {
    static void main(String[] args) {
        String command = "(al)G(al)()()G";
        System.out.println(interpret(command));
    }
    static String interpret(String command) {
        StringBuilder sb=new StringBuilder();
//        String s=command.replace("()","o");
//        return s.replace("(al)","al");
        for(int i=0;i<command.length();i++){
            char ch = command.charAt(i);
            if(ch=='G'){
                sb.append(ch);
            }
            else if(ch=='(' && command.charAt(i+1)==')'){
                sb.append('o');
                i+=1;
            }
            else{
                sb.append("al");
                i+=3;
            }

        }
        return sb.toString();
    }
}
