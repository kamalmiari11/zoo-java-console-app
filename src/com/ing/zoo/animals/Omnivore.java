package com.ing.zoo.animals;

/**
 * Interface representing an Omnivore animal, which can eat both plants and meat.
 * The Omnivore interface extends both Herbivore and Carnivore, meaning it inherits
 * behaviors for eating leaves and meat, as well as greeting behaviors.
 */
public interface Omnivore extends Herbivore, Carnivore {
    // No additional methods are needed as Omnivore inherits from both Herbivore and Carnivore.
}
