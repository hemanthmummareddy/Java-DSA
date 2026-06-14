package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PasclesTriangle {
    public static void main(String[] ar){
        System.out.println(pascles(5));
    }
    static List<List<Integer>> pascles(int n){
        List<List<Integer>> list=new ArrayList<>();

        for(int i=0;i<n;i++){
            List<Integer> li=new ArrayList<>();
            li.add(1);
            if(i>1){
              int a=0,b=1;
              for(int j=1;j<i;j++){
                  int sum=list.get(i-1).get(a)+list.get(i-1).get(b);
                  li.add(sum);
                  a++;
                  b++;
              }
            }
            if(i>0) {
                li.add(1);
            }
            list.add(li);

        }
        return list;
    }
}
