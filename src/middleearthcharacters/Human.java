package middleearthcharacters;

public class Human extends MiddleEarthCharacter{

	public Human(String name, double health, double power) {
		super(name, health, power);
	}

	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if(target.getRace() == "Human") {
			System.out.println("A Human attack is ineffective against another Human.");
			return false;
		}
		else if(target.getRace() == "Orc") {
			System.out.println("A Human attack is ineffective against an Orc.");
			return false;
		}
		else if(target.getRace() == "Wizard") {
			System.out.println("Attacking a Wizard with *1.5 power!");
			target.health -= (this.power * 1.5);
			return true;
		}
		else {
			System.out.println("Attacking Elf or Dwarf with regular power!");
			target.health -= this.power;
			return true;
		}
	}

	@Override
	public String getRace() {
		return("Human");
	}
	
	

}
