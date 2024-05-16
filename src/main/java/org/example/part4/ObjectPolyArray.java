package org.example.part4;

public class ObjectPolyArray {
    public static void main(String[] args) {
        // A,B 클래스를 저장할 배열을 생성하세요
        Object[] obj =new Object[2];
        obj[0] = new A();
        obj[1] = new B();

        for(int i =0 ;i<obj.length;i++){
            if(obj[i] instanceof A){
                ((A)obj[i]).printGO();
            }
            else{
                ((B)obj[i]).printGO();
            }

        }

    }
}
