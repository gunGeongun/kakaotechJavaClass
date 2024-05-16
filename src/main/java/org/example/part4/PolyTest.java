package org.example.part4;

import org.example.model.Animal;
import org.example.model.Cat;
import org.example.model.Dog;

public class PolyTest {
    public static void main(String[] args) {
        // Upcasting으로 객체를 생성
        // 상속관계, 재정의(Override), 동적바인딩
        // 다형성
        Animal ani = new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();

    }
}
