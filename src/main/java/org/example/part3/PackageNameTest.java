package org.example.part3;

import org.example.model.CarDTO; //CarDTO를 쓰기 위한 패키지 임포트

import java.util.Scanner;
// 자바제공해주는 기본 패키지 import java.lang.* 가 생략됨
public class PackageNameTest {
    public static void main(String[] args) {
        // Q. 지금까지 자바에서 제공해주어서 사용해본 클래스의 이름
        String str = "홍길동";  //String
        Scanner scan = new Scanner(System.in); //Scanner
        System.out.println("Hello World"); //System

        //Q. 우리가 직접 만들어서 사용해 본 클래스들의 이름을 적어보자
        CarDTO car = new CarDTO();
    }
}
