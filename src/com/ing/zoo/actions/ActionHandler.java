package com.ing.zoo.actions;

import com.ing.zoo.animals.*;

/**
 * ActionHandler is responsible for performing various actions on animals
 * based on the provided action string.
 */
public class ActionHandler {

    /**
     * Performs the specified action on the given animal.
     *
     * @param animal The animal on which the action will be performed.
     * @param action The action to be performed. Valid actions include:
     *               "hello", "give leaves", "give meat", "perform trick".
     */
    public static void performAction(Animal animal, String action) {
        if ("hello".equals(action)) {
            // Makes the animal say hello.
            animal.sayHello();
        } else if ("give leaves".equals(action) && animal instanceof Herbivore) {
            // Makes a Herbivore animal eat leaves.
            ((Herbivore) animal).eatLeaves();
        } else if ("give meat".equals(action) && animal instanceof Carnivore) {
            // Makes a Carnivore animal eat meat.
            ((Carnivore) animal).eatMeat();
        } else if ("perform trick".equals(action) && animal instanceof TrickPerformer) {
            // Makes an animal that can perform tricks do so.
            ((TrickPerformer) animal).performTrick();
        } else {
            // Prints a message if the action is not valid or not supported by the animal.
            System.out.println("Action not supported or invalid for this animal.");
        }
    }
}
