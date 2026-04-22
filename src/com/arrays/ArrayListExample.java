package com.arrays;

import java.util.ArrayList;

public class ArrayListExample {
    static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(7);
        list.add(2);
        list.add(1,8);
        //update the value at any index
        list.set(3,99);
        //get value at index


        System.out.println(list.getLast());
        System.out.println(list.getFirst());
        System.out.println(list.get(3));
        System.out.println(list);
    }
}
