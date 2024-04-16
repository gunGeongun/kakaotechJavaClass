package org.example.part3;

import org.example.model.MemberDTO;

public class AccessModifier {
    public static void main(String[] args) {
        MemberDTO dto = new MemberDTO();
        dto.name = "홍길동";
        dto.phone = "010-1111-1111";
//        dto.age = 1000; //에러발생(접근불가)
    }
}
