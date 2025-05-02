package com.ing.zoo.animals;

/**
 * Class representing a Lion, which is a type of Carnivore.
 * A Lion is an animal that can greet in a specific way and eat meat.
 */
public class Lion extends Animal implements Carnivore {

    /**
     * Constructor to initialize the Lion's name.
     *
     * @param name The name of the Lion.
     */
    public Lion(String name) {
        super(name);
    }

    /**
     * Makes the Lion greet in its own way by roaring "roooaoaaaaar".
     * This method overrides the abstract sayHello method from the Animal class.
     */
    @Override
    public void sayHello() {
        String helloText = "roooaoaaaaar";
        System.out.println(getName() + " says: " + helloText);
    }

    /**
     * Makes the Lion eat meat in a specific way, saying "nomnomnom thx mate".
     * This method overrides the eatMeat method from the Carnivore interface.
     */
    @Override
    public void eatMeat() {
        String eatText = "nomnomnom thx mate";
        System.out.println(getName() + " eats meat: " + eatText);
    }
}
