package middleearthcharacters;


public class Elf extends MiddleEarthCharacter {

	public Elf(String name, double health, double power) {
		super(name, health, power);
	}

	@Override
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
		else {
			System.out.println("Attacking Human or Wizard with regular power!");
			target.health -= this.power;
			return true;
		}
	}

	@Override
	public String getRace() {
		return("Elf");
	}

	
	
	

}
