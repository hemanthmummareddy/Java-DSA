package recursion.basics;

public class Print1ton {
    public static void main(String []arf){
        int n=5;
        fun(n);//with out return type
//        System.out.println(function(n));//with return type
    }
    static void fun(int n){
        if(n<=0){
            return ;
        }
        fun(n-1);
        System.out.print(n +" ");

    }
}
