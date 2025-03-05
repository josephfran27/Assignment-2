package middleearthcharacters;

public class Wizard extends MiddleEarthCharacter{

	/**
	 * This method creates a new Wizard object, using polymorphism to inherit the properties of the base class MiddleEarthCharacter.
	 * @param name: The name of the Wizard.
	 * @param health: The health of the Wizard.
	 * @param power: The power of the Wizard.
	 */
	public Wizard(String name, double health, double power) {
		super(name, health, power);
	}

	/**
	 * This method overrides the attack method in the MiddleEarthCharacter class to make it unique
	 * to the attacking abilities of the Wizard. It checks the race of the target and adjusts the attacking
	 * strength accordingly.
	 * @param target: The target character/race that is to be attacked.
	 */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if(target.getRace() == "Wizard") {
			System.out.println("A Wizard attack is ineffective against another Wizard.");
			return false;
		}
		else if(target.getRace() == "Human") {
			System.out.println("A Wizard attack is ineffective against a Human.");
			return false;
		}
		else if(target.getRace() == "Dwarf") {
			System.out.println("Attacking Dwarf with *1.5 power!");
			target.health -= (this.power * 1.5);
			return true;
		}
		else if(target.getRace() == "Elf"){
			System.out.println("Attacking Elf with regular power!");
			target.health -= this.power;
			return true;
		}
		else if(target.getRace() == "Orc"){
			System.out.println("Attacking Orc with regular power!");
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
		return("Wizard");
	}

}
