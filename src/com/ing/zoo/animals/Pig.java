package com.ing.zoo.animals;

import java.util.Random;

/**
 * Class representing a Pig, which is an Omnivore and a TrickPerformer.
 * A Pig can greet in a specific way, eat both leaves and meat, and perform tricks.
 */
public class Pig extends Animal implements Omnivore, TrickPerformer {

    /**
     * Constructor to initialize the Pig's name.
     *
     * @param name The name of the Pig.
     */
    public Pig(String name) {
        super(name);
    }

    /**
     * Makes the Pig greet in its own way by saying "oink oink".
     * This method overrides the abstract sayHello method from the Animal class.
     */
    @Override
    public void sayHello() {
        String helloText = "oink oink";
        System.out.println(getName() + " says: " + helloText);
    }

    /**
     * Makes the Pig eat leaves in a specific way, saying "munch munch oink".
     * This method overrides the eatLeaves method from the Herbivore interface.
     */
    @Override
    public void eatLeaves() {
        String eatText = "munch munch oink";
        System.out.println(getName() + " eats leaves: " + eatText);
    }

    /**
     * Makes the Pig eat meat in a specific way, saying "nomnomnom oink thx".
     * This method overrides the eatMeat method from the Carnivore interface.
     */
    @Override
    public void eatMeat() {
        String eatText = "nomnomnom oink thx";
        System.out.println(getName() + " eats meat: " + eatText);
    }

    /**
     * Makes the Pig perform a trick by either rolling in the mud or running in circles.
     * This method overrides the performTrick method from the TrickPerformer interface.
     */
    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        String trick;
        if (rnd == 0) {
            trick = "rolls in the mud";
        } else {
            trick = "runs in circles";
        }
        System.out.println(getName() + " performs trick: " + trick);
    }
}
