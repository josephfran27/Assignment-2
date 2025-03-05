package charactermanagementsystem;

import java.util.Arrays;

import middleearthcharacters.MiddleEarthCharacter;

public class CharacterManager {
	
	private MiddleEarthCharacter[] characters;
	private int size;
	
	public CharacterManager() {
		//create character array with an initial capacity of 5 characters
		this.characters = new MiddleEarthCharacter[5];
		this.size = 0;
	}
	
	public boolean addCharacter(MiddleEarthCharacter c) {
		if(size == characters.length) {
			//Double the character array size if it's full
			characters = Arrays.copyOf(characters, characters.length * 2);
		}
		characters[size++] = c;
		System.out.println("Character has been successfully added.");
		return true;
	}
	
	public MiddleEarthCharacter getCharacter(String name) {
		for(int i = 0; i < size; i++) {
			if(characters[i].getName().equals(name)) {
				characters[i].displayInfo();
				return characters[i];
			}
		}
		return null;
	}
	
	
	
}
