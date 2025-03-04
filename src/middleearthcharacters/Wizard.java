package middleearthcharacters;

public class Wizard extends MiddleEarthCharacter{

	public Wizard(String name, double health, double power) {
		super(name, health, power);
	}

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
		else {
			System.out.println("Attacking an Elf or Orc with regular power!");
			target.health -= this.power;
			return true;
		}
	}

	@Override
	public String getRace() {
		return("Wizard");
	}

}
