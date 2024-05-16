package org.example.course2.part1;

public class MyintArrayTest {
    public static void main(String[] args){
        IntArray list = new IntArray();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(0)); // 1
        System.out.println(list.get(1)); // 2
        System.out.println(list.get(2)); // 3
        System.out.println(list.size()); // 3
    }
}
