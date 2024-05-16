package org.example.course2.part1;

public class StringManipulation {
    public static void main(String[] args) {
        String str =new String("HelloWorld");
        char firstChar = str.charAt(0);
        String replacedString = str.replaceAll("o", "X"); //o를 X로 치환
        int index = str.indexOf("W"); //문자열 내에서 w의 index 반환
        int length = str.length(); //문자열 길이 반환
        String upperCase = str.toUpperCase(); //대문자 변환
        String lowerCase = str.toLowerCase(); //소문자 변환
        String substring = str.substring(5); //시작 index부터 끝 index 까지 추출
        System.out.println(firstChar);
        System.out.println(replacedString);
        System.out.println(index);
        System.out.println(length);
        System.out.println(upperCase);
        System.out.println(lowerCase);
        System.out.println(substring);
    }
}