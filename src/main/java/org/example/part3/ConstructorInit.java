package org.example.part3;

import org.example.model.PersonVO;

public class ConstructorInit {
    public static void main(String[] args) {
        // Q.생성자 메서드를 통해 PersonVO 객체에 이름 ,나이 ,전화번호를 저장하시오
        PersonVO vo = new PersonVO();
        System.out.println(vo.getName()+vo.getAge()+vo.getPhone());
        PersonVO vo1 = new PersonVO();
        System.out.println(vo1.getName()+vo1.getAge()+vo1.getPhone());
    }
}
