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
			System.out.println("Doubling capacity. New length is: " + characters.length);
		}
		characters[size++] = c;
		System.out.println("Character has been successfully added, size is currently: "+ size + ".");
		return true;
	}
	
	public MiddleEarthCharacter getCharacter(String name) {
		for(int i = 0; i < size; i++) {
			if(characters[i].getName().equals(name)) {
				return characters[i];
			}
		}
		return null;
	}
	
	public boolean updateCharacter(MiddleEarthCharacter character, String name, int health, int power) {
		if(character != null) {
			//check if identical character object already exists
			if(character.getName().equals(name) && character.getHealth() == health && character.getPower() == power) {
				System.out.println("This character already exists.");
				return false;
			}
			character.setName(name);
			character.setHealth(health);
			character.setPower(power);
			return true;
		}
		return false;
	}
	
	public boolean deleteCharacter(MiddleEarthCharacter character) {
		for(int i = 0; i < size; i++) {
			if(characters[i] == character) {
				//shifts all characters left starting at the position of the character to be deleted
				for(int j = i; j < size -1; j++) {
					characters[j] = characters[j+1];
				}
				characters[size-1] = null;
				size--;
				System.out.println("Removing " + character.getName() + ", new size is " + size);
				return true;
			}
		}
		return false;
	}
	
	public void displayAllCharacters() {
		for(int i = 0; i < size; i++) {
			characters[i].displayInfo();
		}
	}
	
	
	
}
