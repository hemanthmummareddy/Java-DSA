package recursion.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearchReturningArrayList {
    public static void main(String[] args){
        int[] arr={1,2,4,5,4};
        int k=4;
//        ArrayList<Integer> list=new ArrayList<>();
//        System.out.println(findAll(arr,k,0,list));
        //you can go like that or this way
        ArrayList<Integer> ans=findAll(arr,k,0,new ArrayList<>());
        System.out.println(ans);
        //with out creating external array list
        // creating array list inside of the body of the functions so that no need to pass the list paramenter
        System.out.println(findall2(arr,k,0));
    }
    static ArrayList<Integer> findAll(int[] arr,int k,int i,ArrayList<Integer> list){
        if(arr.length==i){
            return list ;
        }
        if(arr[i]==k) list.add(i);
        return findAll(arr,k,i+1,list);
    }
    static ArrayList<Integer> findall2(int[] arr,int k,int i){
        ArrayList<Integer> list=new ArrayList<>();
        if(arr.length==i){
            return list ;
        }
        if(arr[i]==k)
            list.add(i);
        ArrayList<Integer> dataBelow=findall2(arr,k,i+1);
        list.addAll(dataBelow);
        return list;
    }

}
