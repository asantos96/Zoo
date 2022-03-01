package com.company;

public class Cheetah extends Animal{
    double avgSpeed;
    String name;

    public Cheetah (String species, String color, int age, double avgSpeed, String name){
        super(species, color, age);
        this.avgSpeed = avgSpeed;
        this.name = name;
    }
    @Override
    public void printAnimalDetails(){
        super.printAnimalDetails();
        System.out.println("Average Speed: " + avgSpeed + "Name: " + name);
    }

}
