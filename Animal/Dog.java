package com.app;

public class Dog extends Animal{

    public Dog(String m_name) {
        super(m_name);
    }

    public void bark(){
        System.out.println("Woof-Woof");
    }
}
