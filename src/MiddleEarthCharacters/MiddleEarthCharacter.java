package MiddleEarthCharacters;

public abstract class MiddleEarthCharacter {
	
	protected String name;
	protected double health;
	protected double power;
	
	public MiddleEarthCharacter(String name, double health, double power) {
		this.name = name;
		this.health = health;
		this.power = power;
	}
}
