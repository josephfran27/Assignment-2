package charactermanagementsystem;

import java.util.Arrays;

import middleearthcharacters.MiddleEarthCharacter;

public class CharacterManager {
	
	private MiddleEarthCharacter[] characters;
	private int size;
	
	/**
	 * This method initializes an empty MiddleEarthCharacter array, which stores objects of each character.
	 * Its initial capacity/length is set to 5 and the size is set to 0 since there aren't any character objects
	 * in it yet.
	 */
	public CharacterManager() {
		//create character array with an initial capacity of 5 characters
		this.characters = new MiddleEarthCharacter[5];
		this.size = 0;
	}
	
	/**
	 * This method adds a character to the MiddleEarthCharacter array. It is given c (a character object) and 
	 * it adds it to the array while incrementing the size. If the capacity is full, it doubles the size of the
	 * array by using the built in copyOf method which creates a new array by copying the initial array, and doubling
	 * the length of the array.
	 * @param c: The character object that is passed and supposed to be added to the MiddleEarthCharacter array.
	 * @return: It returns true if the character is successfully added, or false if the passed character object is invalid..
	 */
	public boolean addCharacter(MiddleEarthCharacter c) {
		if(c == null) {
			System.out.println("Error adding character.");
			return false;
		}
		if(size == characters.length) {
			//Double the character array size if it's full
			characters = Arrays.copyOf(characters, characters.length * 2);
			System.out.println("Doubling capacity. New length is: " + characters.length);
		}
		characters[size++] = c;
		System.out.println(c.getName() + " has been successfully added, size is currently: "+ size + ".");
		return true;
	}
	
	/**
	 * This method is passed a name of a character. It iterates through the array and if the name of the character
	 * matches one of the character objects, the entire object is returned.
	 * @param name: The name of the character object that is to be searched for.
	 * @return: Returns the character object if it is found, or null if it isn't.
	 */
	public MiddleEarthCharacter getCharacter(String name) {
		for(int i = 0; i < size; i++) {
			if(characters[i].getName().equals(name)) {
				return characters[i];
			}
		}
		return null;
	}
	
	/**
	 * This method updates a character object with the new fields if the object is found in the array. First, the
	 * object is checked to ensure it isn't null, then the fields of the passed character are checked to make sure 
	 * an identical object of the character doesn't already exist, which would return false. If the character object
	 * isn't identical to one that already exists, the new fields are updated.
	 * @param character: The character object that is to be updated.
	 * @param name: The new name that is to be added to the character.
	 * @param health: The new health amount that is to be added to the character.
	 * @param power: The new power amount that is to be added to the character.
	 * @return: This method returns true if the character is updated or false if an identical object already exists or if 
	 * the character object is invalid.
	 */
	public boolean updateCharacter(MiddleEarthCharacter character, String name, double health, double power) {
		if(character != null) {
			//check if identical character object already exists
			if(character.getName().equals(name) && character.getHealth() == health && character.getPower() == power) {
				System.out.println("This character (" + character.getName() + ") already exists.");
				return false;
			}
			character.setName(name);
			character.setHealth(health);
			character.setPower(power);
			System.out.println(character.getName() + " has been updated!");
			return true;
		}
		System.out.println("Error updating character.");
		return false;
	}
	
	/**
	 * This method is passed a character and it deletes it if it is found. This is done by iterating through all of the 
	 * characters, and if there is a match in the array, it removes the character. To ensure that the array is properly resized
	 * and updated, when the character is found, all of the characters to the right of it are moved to the left so that the character 
	 * to be deleted is the last object in the array. When the character is the last object it is set to null and the size of the array
	 * is decremented.
	 * @param character: The character to be removed.
	 * @return: Returns true if the character is removed, or false if it isn't/is invalid.
	 */
	public boolean deleteCharacter(MiddleEarthCharacter character) {
		for(int i = 0; i < size; i++) {
			if(characters[i] == character) {
				//shifts all characters left starting at the position of the character to be deleted
				for(int j = i; j < size -1; j++) {
					characters[j] = characters[j+1];
				}
				characters[size-1] = null;
				size--;
				System.out.println("Removing " + character.getName() + ", new size is " + size + ".");
				return true;
			}
		}
		return false;
	}
	
	/**
	 * This method displays all of the character objects. It loops through the entire array and calls displayInfo to display
	 * the information of each character line by line.
	 */
	public void displayAllCharacters() {
		System.out.println("Displaying all characters...");
		for(int i = 0; i < size; i++) {
			characters[i].displayInfo();
		}
	}
	
}
