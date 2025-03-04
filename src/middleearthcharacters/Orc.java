package middleearthcharacters;

public class Orc extends MiddleEarthCharacter{

	public Orc(String name, double health, double power) {
		super(name, health, power);
	}

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

	@Override
	public String getRace() {
		return ("Orc");
	}
	
	

}
