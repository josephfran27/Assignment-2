package middleearth;

import java.util.Scanner;

import charactermanagementsystem.CharacterManager;
import charactermanagementsystem.MiddleEarthCouncil;
import middleearthcharacters.Dwarf;
import middleearthcharacters.Elf;
import middleearthcharacters.Human;
import middleearthcharacters.MiddleEarthCharacter;
import middleearthcharacters.Orc;
import middleearthcharacters.Wizard;

public class Menu {
	
	private Scanner scanner;
	private CharacterManager manager;
	
	/**
	 * This is the Menu object constructor, which initializes the scanner for input. It also
	 * creates an instance of the characterManager system from the MiddleEarthCouncil.
	 */
	public Menu() {
		scanner = new Scanner(System.in);
		
		MiddleEarthCouncil council = MiddleEarthCouncil.getInstance();
		manager = council.getCharacterManager();
	}
	
	/**
	 * This method displays the primary menu and accepts the different user inputs to perform the
	 * different CRUD operations. It uses a do while loop, so that it repeats until the user chooses
	 * 6 to exit the program.
	 */
	public void displayMenu() {
		int option;
		do {
			System.out.println("\nInput the different numbers based on what you would like to do!");
			System.out.println("(1): Add a new character.");
			System.out.println("(2): Update a character.");
			System.out.println("(3): Delete a character.");
			System.out.println("(4): Display all characters.");
			System.out.println("(5): Choose a character to attack another character.");
			System.out.println("(6): Exit.");
			System.out.println("Enter your choice to dive into Middle Earth!: ");
			option = scanner.nextInt();
			scanner.nextLine();
			
			switch(option) {
			case 1: 
				addCharacter();
				break;
			case 2:
				updateCharacter();
				break;
			case 3:
				deleteCharacter();
				break;
			
			case 4:
				displayCharacters();
				break;
			case 5:
				attackCharacter();
				break;
			case 6:
				System.out.println("Exiting Middle Earth!");
				break;
			default:
				System.out.println("Please enter a valid choice!");
					
			}
		}
		while (option != 6);
	}
	
	/**
	 * This method adds a new character using the user input through a switch case. It creates the character after the user
	 * chooses all of the fields of the character, and adds it to the character manager.
	 */
	private void addCharacter() {
		//get fields for character
		System.out.println("Enter the number corresponding with the race of the character that you want to add.");
		System.out.println("(1) Dwarf -- (2) Elf -- (3) Wizard -- (4) Human -- (5) Orc:");
		
		Integer type = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter a name: ");
		String name = scanner.nextLine();
		
		System.out.println("Enter health: ");
		double health = scanner.nextDouble();
		
		System.out.println("Enter attacking power: ");
		double power = scanner.nextDouble();
		scanner.nextLine();
		
		//apply fields
		MiddleEarthCharacter character = null;
		switch(type) {
		case 1:
			character = new Dwarf(name, health, power);
			break;
		case 2:
			character = new Elf(name, health, power);
			break;
		case 3:
			character = new Wizard(name, health, power);
			break;
		case 4: 
			character = new Human(name, health, power);
			break;
		case 5:
			character = new Orc(name, health, power);
			break;
		default:
			System.out.println("Please enter a valid character type.");
			return;
		}
		
		manager.addCharacter(character);
	}
	
	/**
	 * This method updates the different fields of an existing character. It accepts a name and it applies the new
	 * fields.
	 */
	private void updateCharacter() {
		System.out.println("Enter the name of the character that you want to update:");
		String name = scanner.nextLine();
		MiddleEarthCharacter character = manager.getCharacter(name);
		
		if (character == null) {
			System.out.println("Unable to find character (" + name + ").");
			return;
		}
		
		System.out.println("Enter new health: ");
		double newHealth = scanner.nextDouble();
		System.out.println("Enter new power: ");
		double newPower = scanner.nextDouble();
		scanner.nextLine();
		
		manager.updateCharacter(character, character.getName(), newHealth, newPower);
	}
	
	/**
	 * This method deletes a character from the character manager. It takes the name as an input
	 * and deletes the character if it exists.
	 */
	private void deleteCharacter() {
		System.out.println("Enter the name of the character that you want to delete: ");
		String name = scanner.nextLine();
		MiddleEarthCharacter character = manager.getCharacter(name);
		
		if (character == null) {
			System.out.println("Unable to find character (" + name + ").");
			return;
		}
		
		manager.deleteCharacter(character);
	}
	
	private void displayCharacters() {
		manager.displayAllCharacters();
	}
	
	/**
	 * This method supports the attack feature of the different characters. The user first chooses a character
	 * to attack with, then they choose a character that they would like to attack. The attack method invoked from the 
	 * characterManager class will return the different attack actions and the effects of the attacks on the different 
	 * characters.
	 */
	private void attackCharacter() {
		System.out.println("Who do you want to attack with? (Enter name): ");
		String name = scanner.nextLine();
		MiddleEarthCharacter attacker = manager.getCharacter(name);
		
		if (attacker == null) {
			System.out.println("Unable to find character (" + name + ").");
			return;
		}
		
		System.out.println("Who do you want to attack using " + name + "?: ");
		String targetName = scanner.nextLine();
		MiddleEarthCharacter target = manager.getCharacter(targetName);
		
		if (target == null) {
			System.out.println("Unable to find character (" + targetName + ").");
			return;
		}
		
		attacker.attack(target);
	}

}


