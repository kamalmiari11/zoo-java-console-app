package com.ing.zoo;

import com.ing.zoo.animals.*;
import com.ing.zoo.actions.*;
import java.util.*;

/**
 * The Zoo class simulates a zoo where various animals can perform actions such as greeting,
 * eating specific foods, and performing tricks based on user commands.
 */
public class Zoo {

    /**
     * The main method that serves as the entry point of the Zoo program.
     * It processes user commands to make animals perform various actions.
     *
     * @param args Command line arguments (not used in this implementation).
     */
    public static void main(String[] args) {
        // Create a list to store animals
        List<Animal> animals = new ArrayList<>();

        // Instantiate animals
        animals.add(new Giraffe("george"));
        animals.add(new Elephant("ella"));
        animals.add(new Lion("henk"));
        animals.add(new Hippo("elsa"));
        animals.add(new Pig("dora"));
        animals.add(new Tiger("wally"));
        animals.add(new Zebra("marty"));

        // Scanner for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        // Read the user input
        String input = scanner.nextLine().trim();

        // Command processing
        String[] inputParts = input.split(" ");
        String command = inputParts[0].toLowerCase();

        // Switch case to handle different commands
        switch (command) {
            case "hello":
                handleHelloCommand(inputParts, animals);
                break;

            case "give":
                handleGiveCommand(inputParts, animals);
                break;

            case "perform":
                handlePerformCommand(inputParts, animals);
                break;

            default:
                System.out.println("Unknown command.");
        }

        scanner.close();
    }

    /**
     * Handles the 'hello' command. It either makes all animals say hello or a specific animal
     * based on the provided name.
     *
     * @param inputParts The parts of the user input command.
     * @param animals The list of animals in the zoo.
     */
    private static void handleHelloCommand(String[] inputParts, List<Animal> animals) {
        if (inputParts.length == 1) {
            // Say hello for all animals
            for (Animal animal : animals) {
                ActionHandler.performAction(animal, "hello");
            }
        } else if (inputParts.length == 2) {
            // Say hello for a specific animal
            String name = inputParts[1];
            boolean found = false;

            for (Animal animal : animals) {
                if (animal.getName().equalsIgnoreCase(name)) {
                    ActionHandler.performAction(animal, "hello");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Animal with name " + name + " not found.");
            }
        } else {
            System.out.println("Invalid 'hello' command format. Usage: hello [animal_name]");
        }
    }

    /**
     * Handles the 'give' command. It gives either leaves or meat to the appropriate animals.
     *
     * @param inputParts The parts of the user input command.
     * @param animals The list of animals in the zoo.
     */
    private static void handleGiveCommand(String[] inputParts, List<Animal> animals) {
        if (inputParts.length == 2) {
            String type = inputParts[1].toLowerCase();

            if (type.equals("leaves")) {
                // Give leaves to all herbivores
                boolean found = false;
                for (Animal animal : animals) {
                    if (animal instanceof Herbivore) {
                        ActionHandler.performAction(animal, "give leaves");
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("No herbivores found in the zoo.");
                }
            } else if (type.equals("meat")) {
                // Give meat to all carnivores
                boolean found = false;
                for (Animal animal : animals) {
                    if (animal instanceof Carnivore) {
                        ActionHandler.performAction(animal, "give meat");
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("No carnivores found in the zoo.");
                }
            } else {
                System.out.println("Unknown food type: " + type + ". Valid types are 'leaves' or 'meat'.");
            }
        } else {
            System.out.println("Invalid 'give' command format. Usage: give [leaves/meat]");
        }
    }

    /**
     * Handles the 'perform' command. It triggers the animals that can perform tricks to do so.
     *
     * @param inputParts The parts of the user input command.
     * @param animals The list of animals in the zoo.
     */
    private static void handlePerformCommand(String[] inputParts, List<Animal> animals) {
        if (inputParts.length == 2 && inputParts[1].equalsIgnoreCase("trick")) {
            // Perform trick for animals that can perform it
            boolean found = false;
            for (Animal animal : animals) {
                if (animal instanceof TrickPerformer) {
                    ActionHandler.performAction(animal, "perform trick");
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No animals can perform tricks.");
            }
        } else {
            System.out.println("Invalid 'perform' command format. Usage: perform trick");
        }
    }
}
