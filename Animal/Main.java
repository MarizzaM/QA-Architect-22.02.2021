package com.app;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Fluffy");
        Cat cat = new Cat("Garfield");

        Animal[] animals = new Animal[]{dog, cat};

        for (int i = 0; i < animals.length; i++){
            makeSound(animals[i]);
        }
    }

    private static void makeSound(Animal animal){
        if (animal instanceof Dog){
            ((Dog)animal).bark();
        } else if (animal instanceof Cat){
            ((Cat) animal).miau();
        } else {
            throw new ClassCastException("Unknown class");
        }
    }
}
