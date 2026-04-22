package Strings.Basics;

public class ComparisonOfStrings {
    public static void main(String[] args){
        String a="Reddy";
        String b="Reddy";
//        System.out.println(a==b);//True: because of the string pool the
        String s1=new String("Reddy");
        String s2=new String("Reddy");
        System.out.println(new int[]{1,2});
        System.out.println(s1.equals(s2));//false : because the diffrent object created each are pointing to different objects

    }

}
