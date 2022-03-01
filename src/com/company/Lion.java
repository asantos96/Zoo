package com.company;

public class Lion extends Animal{
    boolean hasMane;
    String gender;

    public Lion (String species, String color, int age, boolean hasMane, String gender){
        super(species, color, age);
        this.hasMane = hasMane;
        this.gender = gender;
    }
    @Override
    public void printAnimalDetails(){
        super.printAnimalDetails();
        System.out.println("Has Mane: " + hasMane + "Gender: " + gender);
    }

}
