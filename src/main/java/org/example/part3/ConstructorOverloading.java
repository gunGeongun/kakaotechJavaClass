package org.example.part3;

import org.example.model.PersonVO;

public class ConstructorOverloading {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO();
        PersonVO vo1 = new PersonVO("김길동", 60,"010-2222-2222");
        PersonVO vo2 = new PersonVO("조길동", 50,"010-3333-3333");
        System.out.println(vo1.getName()+vo1.getAge()+vo1.getPhone());
        System.out.println(vo2.getName()+vo2.getAge()+vo2.getPhone());
    }
}
