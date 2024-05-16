package org.example.model;

public class Cat extends Animal{
    public void night(){
        System.out.println("고양이가 잠에듭니다.");
    }
    @Override
    public void eat(){
        System.out.println("고양이처럼 먹다.");
    }
}
