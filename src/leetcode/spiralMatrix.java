package leetcode;

public class spiralMatrix {
    static void main(String[] args) {
        int[][] arr={{1,2,3},{5,6,7,8},{9,10,11,12}};
        mat(arr);
    }
    static void mat(int[][] arr){
        int t=0,b=arr.length-1,l=0,r=arr[0].length-1;
        while(l<=r & t<=b){
            for(int i=l;i<=r;i++){
                System.out.print(arr[t][i]);
            }
            t+=1;
            for(int i=t;i<=b;i++){
                System.out.print(arr[i][r]);

            }
            r-=1;
            if(t<=b){
                for(int i=r;i>=l;i--){
                    System.out.print(arr[b][i]);
                }
                b-=1;

            }
            if(l<=r){
                for(int i=b;i>=t;i--){
                    System.out.print(arr[i][l]);
                }
                l+=1;
            }
        }
    }
}
