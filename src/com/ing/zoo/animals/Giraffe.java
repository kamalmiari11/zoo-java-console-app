package com.ing.zoo.animals;

/**
 * The Giraffe class represents a giraffe, which is a herbivore.
 * It is capable of greeting and eating leaves.
 */
public class Giraffe extends Animal implements Herbivore {

    /**
     * Constructor to initialize the Giraffe's name.
     *
     * @param name The name of the giraffe.
     */
    public Giraffe(String name) {
        super(name);
    }

    /**
     * Makes the giraffe say hello.
     * The greeting is specific to giraffes.
     */
    @Override
    public void sayHello() {
        String helloText = "giraffe giraffe";
        System.out.println(getName() + " says: " + helloText);
    }

    /**
     * Makes the giraffe eat leaves.
     * The behavior is specific to herbivores, and the giraffe eats leaves from the trees.
     */
    @Override
    public void eatLeaves() {
        String eatText = "munch munch leaves from the trees";
        System.out.println(getName() + " eats leaves: " + eatText);
    }
}
