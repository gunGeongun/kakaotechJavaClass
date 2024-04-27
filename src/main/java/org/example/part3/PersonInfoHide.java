package org.example.part3;

import org.example.model.PersonVO;

public class PersonInfoHide {
    public static void main(String[] args) {
        //Q. 한사람의 회원 정보를 저장할 객체를 생성하세요.
        PersonVO vo = new PersonVO();
        System.out.println(vo.getName() + vo.getAge() + vo.getPhone());
    }
}
