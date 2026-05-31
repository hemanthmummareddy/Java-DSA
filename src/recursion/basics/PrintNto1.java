package recursion.basics;

public class PrintNto1 {
    public static void main(String []arf){
        int n=5;
        fun(n);//with out return type
        System.out.println(function(n));//with return type
    }
    //with out return type
    static void fun(int n){
        if(n<=0){
            return ;
        }
        System.out.print(n +" ");
        fun(n-1);
    }
    static int function(int n){
        if(n==1){
            return n;
        }
        System.out.print(n+" ");
        return function(n-1);
    }

}

