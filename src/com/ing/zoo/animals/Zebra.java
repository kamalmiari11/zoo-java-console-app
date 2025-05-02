package com.ing.zoo.animals;

/**
 * Class representing a Zebra, which is a Herbivore.
 * A Zebra can greet in a specific way and eat leaves.
 */
public class Zebra extends Animal implements Herbivore {

    /**
     * Constructor to initialize the Zebra's name.
     *
     * @param name The name of the Zebra.
     */
    public Zebra(String name) {
        super(name);
    }

    /**
     * Makes the Zebra greet in its own way by saying "zebra zebra".
     * This method overrides the abstract sayHello method from the Animal class.
     */
    @Override
    public void sayHello() {
        String helloText = "zebra zebra";
        System.out.println(getName() + " says: " + helloText);
    }

    /**
     * Makes the Zebra eat leaves in a specific way, saying "munch munch zank yee bra".
     * This method overrides the eatLeaves method from the Herbivore interface.
     */
    @Override
    public void eatLeaves() {
        String eatText = "munch munch zank yee bra";
        System.out.println(getName() + " eats leaves: " + eatText);
    }
}
