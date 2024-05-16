package org.example.course2.part1;

public class InterfaceAPI {
    public static void main(String[] args) {
        CC c = new BB();
        c.x(); //BB의 x()가 동작 -> 동적바인딩
    }
}
