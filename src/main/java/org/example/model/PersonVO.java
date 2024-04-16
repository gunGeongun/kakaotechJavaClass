package org.example.model;

public class PersonVO {
    private String name;
    private int age;
    private String phone;
    public PersonVO(){
        this.name = "홍길동";
        this.age = 50;
        this.phone = "010-1111-1111";
    }
    public PersonVO(String name,int age,String phone){ //생성자 오버로딩
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getPhone() {
        return phone;
    }
}
