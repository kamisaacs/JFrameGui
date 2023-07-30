package virtual.pets;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    // Initialize a scanner
    static Scanner input = new Scanner(System.in);
    // ArrayList so I can traverse all of the animals in my shelter
    static ArrayList<Animals> allAnimals = Animals.allAnimals;

    public void mainMenu() {
        // Initialize an object for my main menu
        InteractWithPet interact = new InteractWithPet();
        interact.tick(allAnimals);
        // Print out a selection for the user to choose form.
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("What would you like to like to do today?");
        System.out.println("-----------------------------------------");
        System.out.println();
        System.out.println("0 = Exit.");
        System.out.println("1 = Choose a pet.");
        System.out.println("2 = Interact with pet");
        System.out.println("3 = Wash your dirty pet.");
        System.out.println("4 = Show your animal some love with a \"Love stroke\". ");
        System.out.println("5 = Ask for your pets health status.");
        System.out.println();
        System.out.println("Select an Option:");
        System.out.println("");

    }

    // Menu options
    public void mainMenuChoice(int option) {
        String menuLoop = "";
        switch (option) {
            case 1: {
                do {
                    // Repeat animal menu while user selects 'yes'
                    animalMenu();
                    String choice = input.nextLine();
                    
                    switch (choice) {
                        case "1": {
                            //Creates a dog object
                            System.out.println("What's your doggy name?");
                            String name = input.nextLine();
                            String paramType = "dog";
                            Dog doggy = new Dog(name, paramType);
                            System.out.println("Your doggy's name is " + name + '.');
                            System.out.println("");
                            System.out.println("");
                            doggy.getArt();
                            System.out.println("");
                            System.out.println("");
                            allAnimals.add(doggy);

                            break;
                        }

                        case "2": {
                            //Creates cat object
                            System.out.println("What's your kitty's name?");
                            String name = input.nextLine();
                            String paramType = "cat";
                            Cat catty = new Cat(name, paramType);
                            allAnimals.add(catty);
                            System.out.println("Say hello to your new friend " + name);
                            System.out.println("");
                            System.out.println("");
                            catty.getArt();
                            System.out.println("");

                            break;
                        }

                        case "3": {
                            //Creates rabbit object
                            System.out.println("What's your rabbits name?");
                            String name = input.nextLine();
                            String paramType = "rabbit";
                            Rabbit buggsy = new Rabbit(name, paramType);
                            allAnimals.add(buggsy);
                            System.out.println("Say hello to " + name + ".\n");
                            Rabbit.rabbitArt();
                            System.out.println("");
                            System.out.println("");
                            break;
                        }
                        case "4": {
                            //Creates dragon object 
                            System.out.println("What's your dragons name?");
                            String name = input.nextLine();
                            String paramType = "dragon";
                            Dragon godzilla = new Dragon(name, paramType);
                            allAnimals.add(godzilla);
                            System.out.println("Say hello to " + name);
                            Dragon.dragonArt();
                            break;
                        }
                    }
                    System.out.println("Do you want another pet?:");
                    menuLoop = input.nextLine();
                    //Keeps menu loop looping
                } while (menuLoop.equalsIgnoreCase("yes"));
                break;

            }
            case 2: {
                chooseInteractPetMenu();
                int choice = input.nextInt();
                input.nextLine();
                singlePetChoice(choice - 1);
                System.out.println("");
                break;
            }
        }
    }

    public int chooseInteractPetMenu() {
        int i = 1;
        for (Animals animal : allAnimals) {
            System.out.println("| " + i + ")" + "\t" + animal.getName() + "\t " + animal.getType());
            i++;
        }
        return allAnimals.size();

    }

    public static void animalMenu() {
        System.out.println("Which animal would you like to choose?:");
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" 1 = Pure Breed Dog");
        System.out.println(" 2 = Alley Cat");
        System.out.println(" 3 = Furry Bunny");
        System.out.println(" 4 = Demon Dragon");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

    }

    public static void chooseInteraction() {
        System.out.println("Which pet would you like to play with?");

    }

    public void singlePetChoice(int index) {
        Animals chosenPet = allAnimals.get(index);

        System.out.println("\b Name: " + chosenPet.getName());
        System.out.println(" Health: " + chosenPet.getHealth());
        System.out.println(" Hunger: " + chosenPet.getHunger());
        System.out.println(" Boredom: " + chosenPet.getBored());
    }

    public void interactionOptions() {
        System.out.println("1) Feed");
        System.out.println("2) Give water");
        System.out.println("3) Pet");
        System.out.println("3) Make dragon spit fire");
        System.out.println("4) Have bunny hop");
    }

}
