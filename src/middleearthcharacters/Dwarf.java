package middleearthcharacters;

public class Dwarf extends MiddleEarthCharacter {
	
	/**
	 * This method creates a new Dwarf object, using polymorphism to inherit the properties of the base class MiddleEarthCharacter
	 * @param name: The name of the Dwarf.
	 * @param health: The health of the Dwarf.
	 * @param power: The power of the Dwarf.
	 */
	public Dwarf(String name, double health, double power) {
		super(name, health, power);
	}

	/**
	 * This method overrides the attack method in the MiddleEarthCharacter class to make it unique
	 * to the attacking abilities of the Dwarf. It checks the race of the target and adjusts the attacking
	 * strength accordingly.
	 * @param target: The target character/race that is to be attacked.
	 */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if(target.getRace() == "Dwarf") {
			System.out.println("A Dwarf attack is ineffective against another Dwarf.");
			return false;
		}
		else if(target.getRace() == "Wizard") {
			System.out.println("A Dwarf attack is ineffective against a Wizard.");
			return false;
		}
		else if(target.getRace() == "Elf") {
			System.out.println("Attacking Elf with *1.5 power!");
			target.health -= (this.power * 1.5);
			return true;
		}
		else {
			System.out.println("Attacking Human or Orc with regular power!");
			target.health -= this.power;
			return true;
		}
	}

	/**
	 * This method overrides the getRace method in the MiddleEarthCharacter class to return a new
	 * unique value of the character that it is invoked under.
	 * @return: The race of the character.
	 */
	@Override
	public String getRace() {
		return ("Dwarf");
	}

}
