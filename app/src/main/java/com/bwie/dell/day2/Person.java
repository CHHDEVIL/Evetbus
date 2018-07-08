package com.bwie.dell.day2;

public class Person {
    private String name;
    private String gender;
    private String age;

    public Person(String name, String gender, String age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

