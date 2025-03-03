package middleearthcharacters;

public class Dwarf extends MiddleEarthCharacter {

	public Dwarf(String name, double health, double power) {
		super(name, health, power);
	}

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

	@Override
	public String getRace() {
		return ("Dwarf");
	}

}
