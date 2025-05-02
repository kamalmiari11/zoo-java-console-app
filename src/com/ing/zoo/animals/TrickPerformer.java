package com.ing.zoo.animals;

/**
 * Interface for animals that can perform tricks.
 * This interface defines methods for greeting and performing tricks.
 */
public interface TrickPerformer {

    /**
     * Method for greeting, to be implemented by animals that can perform tricks.
     * The greeting behavior will vary depending on the specific animal.
     */
    void sayHello();

    /**
     * Method for performing a trick, to be implemented by animals that can perform tricks.
     * The trick behavior will vary depending on the specific animal.
     */
    void performTrick();
}
