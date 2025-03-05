package middleearthcharacters;

public abstract class MiddleEarthCharacter {
	
	public String name;
	public double health;
	public double power;
	
	/**
	 * This is the constructor for each Middle Earth character object.
	 * @param name: The name that is given to the new character object.
	 * @param health: The health amount that is given to the new character object.
	 * @param power: The power amount that is given to the new character object.
	 */
	public MiddleEarthCharacter(String name, double health, double power) {
		this.name = name;
		this.health = health;
		this.power = power;
	}
		
	public abstract boolean attack(MiddleEarthCharacter target);
	public abstract String getRace();
	
	/**
	 * This method displays the different fields of the character object.
	 */
	public void displayInfo() {
		System.out.println("Name: " + this.name + ", Health: " + this.health + ", Power: " + this.power);
	}
	
	/**
	 * This method returns the name of the character object when called.
	 * @return: The name of the character.
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * This method returns the health of the character object when called.
	 * @return: The health of the character.
	 */
	public double getHealth() {
		return this.health;
	}
	
	/**
	 * This method returns the power of the character object when called.
	 * @return: The health of the character.
	 */
	public double getPower() {
		return this.power;
	}

	/**
	 * This method gives a character the passed name, this is used in the updateCharacter method.
	 * @param name: The name that is to be given to the character.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * This method gives a character the passed health, this is used in the updateCharacter method.
	 * @param health: The health that is to be given to the character.
	 */
	public void setHealth(double health) {
		this.health = health;
	}

	/**
	 * This method gives a character the passed power, this is used in the updateCharacter method.
	 * @param power: The power that is to be given to the character.
	 */
	public void setPower(double power) {
		this.power = power;
	}
	
}
