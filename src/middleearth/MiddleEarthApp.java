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
		
		manager.addCharacter(legolas);
		manager.addCharacter(gimli);
		
		manager.getCharacter("Gimli");
		manager.getCharacter("Legolas");
	}

}
