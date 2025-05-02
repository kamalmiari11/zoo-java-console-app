package com.ing.zoo.animals;

import java.util.Random;

/**
 * Class representing a Tiger, which is a Carnivore and a TrickPerformer.
 * A Tiger can greet in a specific way, eat meat, and perform tricks.
 */
public class Tiger extends Animal implements Carnivore, TrickPerformer {

    /**
     * Constructor to initialize the Tiger's name.
     *
     * @param name The name of the Tiger.
     */
    public Tiger(String name) {
        super(name);
    }

    /**
     * Makes the Tiger greet in its own way by saying "rraaarww".
     * This method overrides the abstract sayHello method from the Animal class.
     */
    @Override
    public void sayHello() {
        String helloText = "rraaarww";
        System.out.println(getName() + " says: " + helloText);
    }

    /**
     * Makes the Tiger eat meat in a specific way, saying "nomnomnom oink wubalubadubdub".
     * This method overrides the eatMeat method from the Carnivore interface.
     */
    @Override
    public void eatMeat() {
        String eatText = "nomnomnom oink wubalubadubdub";
        System.out.println(getName() + " eats meat: " + eatText);
    }

    /**
     * Makes the Tiger perform a trick by either jumping in a tree or scratching its ears.
     * This method overrides the performTrick method from the TrickPerformer interface.
     */
    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        String trick = (rnd == 0) ? "jumps in tree" : "scratches ears";
        System.out.println(getName() + " performs trick: " + trick);
    }
}
