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
	
	public Menu() {
		scanner = new Scanner(System.in);
		
		//initialize council and character manager
		MiddleEarthCouncil council = MiddleEarthCouncil.getInstance();
		manager = council.getCharacterManager();
	}
	
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


