package com.ing.zoo.animals;

/**
 * Abstract class representing an animal. All specific animal types will extend this class
 * and provide implementations for the abstract methods.
 */
public abstract class Animal {
    private String name;

    /**
     * Constructor to initialize the Animal's name.
     *
     * @param name The name of the animal.
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the animal.
     *
     * @return The name of the animal.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the animal.
     *
     * @param name The new name for the animal.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Abstract method that must be implemented by subclasses to define how the animal greets.
     * The specific greeting behavior will depend on the animal type.
     */
    public abstract void sayHello();
}
