package com.company;

public class Hippo extends Animal {
    double weight;

    public Hippo(String species, String color, int age, double weight) {
        super(species, color, age);
        this.weight = weight;
    }

    @Override
    public void printAnimalDetails() {
        super.printAnimalDetails();
        System.out.println("Weight: " + weight);

    }
}