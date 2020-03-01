package com.company;

public class Cat {
    private String name;
    private int age;

    public Cat(){

    }
    public Cat(int age){
        this.age = age;
    }
    public Cat(String name){
        this.name = name;
    }
    public Cat(int age, String name){
        this.age = age;
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
