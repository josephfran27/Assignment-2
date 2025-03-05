package middleearth;

import charactermanagementsystem.CharacterManager;
import charactermanagementsystem.MiddleEarthCouncil;
import middleearthcharacters.Dwarf;
import middleearthcharacters.Elf;

public class MiddleEarthApp {

	public static void main(String[] args) {
		MiddleEarthCouncil council = MiddleEarthCouncil.getInstance();
		CharacterManager manager = council.getCharacterManager();
		
		Elf legolas = new Elf("Legolas", 120.0, 30.0);
		Dwarf gimli = new Dwarf("Gimli", 100.0, 25.0);
		Dwarf dwalin = new Dwarf("Dwalin", 100.0, 25.0);
		Dwarf balin = new Dwarf("Balin", 100.0, 25.0);
		Dwarf thorin = new Dwarf("Thorin", 100.0, 25.0);
		Elf capacity = new Elf("capacityElf", 120.0, 30.0);
		
		
		manager.addCharacter(legolas);
		manager.addCharacter(gimli);
		manager.addCharacter(dwalin);
		manager.addCharacter(balin);
		manager.addCharacter(thorin);
		manager.addCharacter(capacity);
		
		manager.getCharacter("Gimli");
		manager.getCharacter("Legolas");
		
		
		manager.displayAllCharacters();
		
		legolas.attack(gimli);
		gimli.attack(legolas);
		
		manager.displayAllCharacters();
		
		manager.deleteCharacter(legolas);
		manager.displayAllCharacters();
		
		
	}

}
