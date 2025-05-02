package com.ing.zoo.animals;

/**
 * Interface representing a Carnivore animal. Carnivores are animals that eat meat
 * and have a specific way of greeting.
 */
public interface Carnivore {

    /**
     * Makes the carnivore animal greet in its own way.
     * This method should be implemented by any class that represents a carnivore.
     */
    void sayHello();

    /**
     * Makes the carnivore animal eat meat.
     * This method should be implemented by any class that represents a carnivore.
     */
    void eatMeat();
}
