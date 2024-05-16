package org.example.part4;

public class ObjectPolyArg {
    public static void main(String[] args) {
        A a = new A();
        display(a);
        B b = new B();
        display(b);
    }
    private static void display(Object obj){ //다형성 인수 활용
        if(obj instanceof A){
            ((A)obj).printGO();
        }
        else{
            ((B)obj).printGO();
        }
    }
}
