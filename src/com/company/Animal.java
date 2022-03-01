package com.company;

public class Animal {

    String species;
    String color;
    int age;

    public Animal(String species, String color, int age){
        this.species = species;
        this.color = color;
        this.age = age;
    }
    public void printAnimalDetails(){
        System.out.println("Species: " + species + "." + "Color: " + color + "Age: " + age);
    }
}
