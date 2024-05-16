package org.example.part4;

import org.example.model.Animal;
import org.example.model.Cat;
import org.example.model.Dog;

public class PolyInstanceOfTest {
    public static void main(String[] args) {
        Dog d= new Dog();
        Cat c = new Cat();
        Animal[] ani = new Animal[2];
        ani[0] = d;
        ani[1] = c;
        display(ani);

    }
    public static void display(Animal[] ani){
        for(int i = 0 ; i<ani.length;i++){
            ani[i].eat();

        }
    }
}


