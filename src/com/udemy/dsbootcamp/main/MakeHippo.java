package com.udemy.dsbootcamp.main;

public class MakeHippo {
    public static void main(String[] args) {
        Animal h = new Hippo("Buffy");
        System.out.println(h.getName());
    }
}

class Hippo extends Animal{
    public Hippo(String name){
        super(name);
    }
}

abstract class Animal{
    private String name;
    public Animal(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
