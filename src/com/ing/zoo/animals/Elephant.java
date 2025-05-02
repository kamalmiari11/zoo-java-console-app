package com.ing.zoo.animals;

import java.util.Random;

/**
 * The Elephant class represents an elephant that is both a Herbivore and a TrickPerformer.
 * It is capable of greeting, eating leaves, and performing a random trick.
 */
public class Elephant extends Animal implements Herbivore, TrickPerformer {

    /**
     * Constructor to initialize the Elephant's name.
     *
     * @param name The name of the elephant.
     */
    public Elephant(String name) {
        super(name);
    }

    /**
     * Makes the elephant say hello.
     * The greeting is specific to elephants.
     */
    @Override
    public void sayHello() {
        String helloText = "elephant elephant";
        System.out.println(getName() + " says: " + helloText);
    }

    /**
     * Makes the elephant eat leaves.
     * The behavior is specific to herbivores, and the elephant munches in its own style.
     */
    @Override
    public void eatLeaves() {
        String eatText = "munch munch elephant-style";
        System.out.println(getName() + " eats leaves: " + eatText);
    }

    /**
     * Makes the elephant perform a random trick.
     * The trick can either be flapping ears or spinning in a circle.
     */
    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        String trick = (rnd == 0) ? "flaps ears" : "spins in a circle";
        System.out.println(getName() + " performs trick: " + trick);
    }
}
