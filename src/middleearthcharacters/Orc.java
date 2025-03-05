package middleearthcharacters;

public class Orc extends MiddleEarthCharacter{

	/**
	 * This method creates a new Orc object, using polymorphism to inherit the properties of the base class MiddleEarthCharacter
	 * @param name: The name of the Orc.
	 * @param health: The health of the Orc.
	 * @param power: The power of the Orc.
	 */
	public Orc(String name, double health, double power) {
		super(name, health, power);
	}

	/**
	 * This method overrides the attack method in the MiddleEarthCharacter class to make it unique
	 * to the attacking abilities of the Orc. It checks the race of the target and adjusts the attacking
	 * strength accordingly.
	 * @param target: The target character/race that is to be attacked.
	 */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if(target.getRace() == "Orc") {
			System.out.println("An Orc attack is ineffective against another Orc.");
			return false;
		}
		else if(target.getRace() == "Elf") {
			System.out.println("An Orc attack is ineffective against an Elf.");
			return false;
		}
		else if(target.getRace() == "Human") {
			System.out.println("Attacking a Human with *1.5 power!");
			target.health -= (this.power * 1.5);
			return true;
		}
		else {
			System.out.println("Attacking Dwarf or Wizard with regular power!");
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
		return ("Orc");
	}

}
