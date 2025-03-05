package middleearth;

import charactermanagementsystem.CharacterManager;
import charactermanagementsystem.MiddleEarthCouncil;
import middleearthcharacters.Dwarf;
import middleearthcharacters.Elf;
import middleearthcharacters.Human;
import middleearthcharacters.Orc;
import middleearthcharacters.Wizard;

public class MiddleEarthApp {

	public static void main(String[] args) {
		
		System.out.println("MIDDLE EARTH CHARACTER MANAGEMENT SYSTEM.");
		Menu menu = new Menu();
		menu.displayMenu();
		
		/*
		MiddleEarthCouncil council = MiddleEarthCouncil.getInstance();
		CharacterManager manager = council.getCharacterManager();
		
		Elf legolas = new Elf("Legolas", 120.0, 30.0);
		Dwarf gimli = new Dwarf("Gimli", 150.0, 25.0);
		Wizard gandalf = new Wizard("Gandalf", 200.0, 50.0);
		Orc azog = new Orc("Azog", 150.0, 20.0);
		Human aragorn = new Human("Aragorn", 100.0, 20.0);
		Dwarf thorin = new Dwarf("Thorin", 150.0, 25.0);
		
		//add characters
		System.out.println("Adding characters...");
		manager.addCharacter(legolas);
		manager.addCharacter(gimli);
		manager.addCharacter(gandalf);
		manager.addCharacter(azog);
		manager.addCharacter(aragorn);
		manager.addCharacter(thorin);
		
		//display all characters
		System.out.println("\nCharacters before battle...");
		manager.displayAllCharacters();
		
		System.out.println("\nTesting update/delete methods...");
		//test updating existing character
		manager.updateCharacter(gandalf, "Gandalf", 200.0, 50.0);
		//test updating character
		manager.updateCharacter(thorin, "Thorin", 160.0, 30.0);
		//test removing character
		manager.deleteCharacter(thorin);
		
		System.out.println("\nTesting attack with legolas (Elf).");
		legolas.attack(gimli);
		legolas.attack(gandalf);
		legolas.attack(azog);
		legolas.attack(aragorn);
		
		System.out.println("\nTesting attack with Gimli (Dwarf).");
		gimli.attack(legolas);
		gimli.attack(gandalf);
		gimli.attack(azog);
		gimli.attack(aragorn);
		
		System.out.println("\nTesting attack with Gandalf (Wizard).");
		gandalf.attack(legolas);
		gandalf.attack(gimli);
		gandalf.attack(azog);
		gandalf.attack(aragorn);
		
		System.out.println("\nTesting attack with Azog (Orc).");
		azog.attack(legolas);
		azog.attack(gimli);
		azog.attack(gandalf);
		azog.attack(aragorn);
		
		System.out.println("\nTesting attack with Aragorn (Human).");
		aragorn.attack(legolas);
		aragorn.attack(gimli);
		aragorn.attack(gandalf);
		aragorn.attack(azog);
		
		System.out.println("\nDisplaying characters after battle...");
		manager.displayAllCharacters();
		*/
	}

}
