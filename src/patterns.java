public class patterns {
    static void main(String[] args) {
//        pattern1(4);
//        pattern28(4);
//        pattern30(4);
//        pattern100(4);
//        pattern31(5);
        pattern100();
    }
    static void  pattern1(int n){
        /*
        this is the pattern need to print
         *
         **
         ***
         ****
         *****
         ****
         ***
         **
         *

         */
        for(int i=0;i<2*n;i++){
            int col=(i>n)?2*n-i:i;
            for(int j=0;j<col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void  pattern30(int n){
        /*
        this is the pattern need to print
            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5


         */
        for(int i=1;i<=n;i++){

            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+"");
            }
            for(int j=2;j<=i;j++){
                System.out.print(j+"");
            }
            System.out.println();
        }
    }
    static void  pattern28(int n){
        /*
        this is the pattern need to print
         *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *

         */
        for(int i=0;i<2*n;i++){
            int col=(i>n)?2*n-i:i;
            int spaces=n-col;
            for(int k=0;k<spaces;k++){
                System.out.print(" ");
            }
            for(int j=0;j<col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern100(int n){
        n=2*n;
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                int row=Math.min(j,n-j);
                int col=Math.min(i,n-i);
                System.out.print(Math.min (row,col)+" ");
            }
            System.out.println();
        }
    }
    static void pattern31(int n){
        int originalN=n;
        n=2*n;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                int row=Math.min(j,n-j);
                int col=Math.min(i,n-i);
                System.out.print(originalN - Math.min (row,col)+" ");
            }
            System.out.println();
        }
    }
    static void pattern100(){
        int n=5;
        for(int i=0;i<2*n-1;i++){
            int col=(i>n)?2*n-i-1:i;
            for(int j=0;j<=col;j++){
                System.out.print("*");
            }
            for(int k=col;k<=2*n-col-1;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=col;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
