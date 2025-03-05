package middleearthcharacters;

public abstract class MiddleEarthCharacter {
	
	public String name;
	public double health;
	public double power;
	
	public MiddleEarthCharacter(String name, double health, double power) {
		this.name = name;
		this.health = health;
		this.power = power;
	}
		
	public abstract boolean attack(MiddleEarthCharacter target);
	public abstract String getRace();
	
	public void displayInfo() {
		System.out.println("Name: " + this.name + ", Health: " + this.health + ", Power: " + this.power);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public double getHealth() {
		return this.health;
	}
	
	public double getPower() {
		return this.power;
	}
		

}
