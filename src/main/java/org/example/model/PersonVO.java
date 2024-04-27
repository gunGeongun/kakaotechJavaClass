package org.example.model;

public class PersonVO {
    private String name;
    private int age;
    private String phone;
    public PersonVO(){
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
    @Override
    public String toString() {
        return "PersonVO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
