package com.ing.zoo.animals;

/**
 * Interface representing a Herbivore animal. Herbivores are animals that eat leaves
 * and have a specific way of greeting.
 */
public interface Herbivore {

    /**
     * Makes the herbivore animal greet in its own way.
     * This method should be implemented by any class that represents a herbivore.
     */
    void sayHello();

    /**
     * Makes the herbivore animal eat leaves.
     * This method should be implemented by any class that represents a herbivore.
     */
    void eatLeaves();
}
