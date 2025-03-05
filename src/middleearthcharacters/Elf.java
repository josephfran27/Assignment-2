package middleearthcharacters;


public class Elf extends MiddleEarthCharacter {
	
	/**
	 * This method creates a new Elf object, using polymorphism to inherit the properties of the base class MiddleEarthCharacter
	 * @param name: The name of the Elf.
	 * @param health: The health of the Elf.
	 * @param power: The power of the Elf.
	 */
	public Elf(String name, double health, double power) {
		super(name, health, power);
	}

	@Override
	/**
	 * This method overrides the attack method in the MiddleEarthCharacter class to make it unique
	 * to the attacking abilities of the Elf. It checks the race of the target and adjusts the attacking
	 * strength accordingly.
	 * @param target: The target character/race that is to be attacked.
	 */
	public boolean attack(MiddleEarthCharacter target) {
		if(target.getRace() == "Elf") {
			System.out.println("An Elf attack is ineffective against another Elf.");
			return false;
		}
		else if(target.getRace() == "Dwarf") {
			System.out.println("An Elf attack is ineffective against a Dwarf.");
			return false;
		}
		else if(target.getRace() == "Orc") {
			System.out.println("Attacking Orc with *1.5 power!");
			target.health -= (this.power * 1.5);
			return true;
		}
		else if(target.getRace() == "Human"){
			System.out.println("Attacking Human with regular power!");
			target.health -= this.power;
			return true;
		}
		else if(target.getRace() == "Wizard"){
			System.out.println("Attacking Wizard with regular power!");
			target.health -= this.power;
			return true;
		}
		return false;
	}

	/**
	 * This method overrides the getRace method in the MiddleEarthCharacter class to return a new
	 * unique value of the character that it is invoked under.
	 * @return: The race of the character.
	 */
	@Override
	public String getRace() {
		return("Elf");
	}

}
