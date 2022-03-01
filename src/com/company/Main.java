package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    // We Programmed A Zoo
        //Create a new project named Zoo
        //Create a class named Animal and Building and give each some basic properties
        //Create several classes for specific types of animals in the Zoo
        //These classes should extend the Animal class
        //Each specific animal class should have several properties unique to that animal
        //Create a new class that extends Building named AnimalEnclosure
        //AnimalEnclosure should have some properties including a list of Animals in the enclosure
        //Create new class that extends Building named GuestServices to represent the various restaurants,
        // bathrooms, visitor centers, etc. available to zoo guests
        //GuestService should have several properties that a zoo guest service building might have,
        // including a list of services offered
        //In the console, allow a user to get information about each GuestService and Enclosure building and
        // print that information to the console.
        //Bonus: Create a menu item that lets the user search for a specific animal type and find what enclosure
        // they are in.
        //Super Bonus: Create a menu option for zoo employees to add animals to enclosures and add services to
        // guest service building

        //Creates first group of animals
        Cheetah firstCheetah = new Cheetah ("Acinonyx jubatus AKA Cheetah " , "Gold " , 1,
                50.87, "Spot ");
        Cheetah secondCheetah = new Cheetah ("Acinonyx jubatus AKA Cheetah " , "Gold " ,7,
                70.43, "Bob ");
        Lion firstLion = new Lion ("Panthera leo AKA Lion " , "Yellow " , 3, true, "Male ");


        //Establishes first group as list and adds them to the arrayList created
        List<Animal> threeCats = new ArrayList<>();
        threeCats.add(firstCheetah);
        threeCats.add(secondCheetah);
        threeCats.add(firstLion);


        //Creates new enclosure and adds group above to the enclosure
        AnimalEnclosure catHouse = new AnimalEnclosure();
        catHouse.addAnimals(threeCats);

        //Create additional lion and add lion individually to arraylist above
        Lion secondLion = new Lion("Panthera leo AKA Lion", "Yellow", 1, false, "female");
        catHouse.addAnimal(secondLion);

        //Prints details of catHouse enclosure to console
        catHouse.printAnimalEnclosure();


        //Creates second group of animals
        Hippo firstHippo = new Hippo ("Choeropsis liberiensis (Pygmy)", "Gray" , 2, 400.73);
        Hippo secondHippo = new Hippo ("Hippopotamus amphibious" , "Gray" , 8, 600);

        //Establishes second group as list and adds them to the arrayList created
        List<Animal> hippoGroup = new ArrayList<>();
        hippoGroup.add(firstHippo);
        hippoGroup.add(secondHippo);

        //Creates new enclosure and adds group above to the enclosure
        AnimalEnclosure waterHouse = new AnimalEnclosure();
        waterHouse.addAnimals(hippoGroup);

        //Prints details of waterHouse enclosure to console
        waterHouse.printAnimalEnclosure();



    }
}
