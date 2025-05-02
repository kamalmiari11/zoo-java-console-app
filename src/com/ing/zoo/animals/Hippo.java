package com.ing.zoo.animals;

/**
 * Class representing a Hippo, which is a type of Herbivore.
 * A Hippo is an animal that can greet in a specific way and eat leaves.
 */
public class Hippo extends Animal implements Herbivore {

    /**
     * Constructor to initialize the Hippo's name.
     *
     * @param name The name of the Hippo.
     */
    public Hippo(String name) {
        super(name);
    }

    /**
     * Makes the Hippo greet in its own way by saying "splash".
     * This method overrides the abstract sayHello method from the Animal class.
     */
    @Override
    public void sayHello() {
        String helloText = "splash";
        System.out.println(getName() + " says: " + helloText);
    }

    /**
     * Makes the Hippo eat leaves in a specific way, saying "munch munch lovely".
     * This method overrides the eatLeaves method from the Herbivore interface.
     */
    @Override
    public void eatLeaves() {
        String eatText = "munch munch lovely";
        System.out.println(getName() + " eats leaves: " + eatText);
    }
}
