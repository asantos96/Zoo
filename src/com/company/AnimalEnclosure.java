package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalEnclosure extends Building {

    //Create a new class that extends Building named AnimalEnclosure
    //AnimalEnclosure should have some properties including a list of Animals in the enclosure


    //Establishing List to contain created animals
private List <Animal>animalList = new ArrayList<>();

    //Method to add a group of animals
public void addAnimals (List<Animal> animals){
    animalList.addAll(animals);

}
    //Method to add single animal
public void addAnimal(Animal singleAnimal){
    animalList.add(singleAnimal);
}
    //Method to print list that is brought over to Main
public void printAnimalEnclosure() {
    for (int i = 0; i < animalList.size(); i++) {
        animalList.get(i).printAnimalDetails();
    }
}
}


