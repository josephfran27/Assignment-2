package charactermanagementsystem;

public class MiddleEarthCouncil {
	
	private static MiddleEarthCouncil instance;
	private CharacterManager characterManager;
	
	/**
	 * This method creates a singular instance of the characterManager.
	 */
	private MiddleEarthCouncil() {
		characterManager = new CharacterManager();
	}
	
	/**
	 * This method creates a singular static instance of the MiddleEarthCouncil so that there aren't 
	 * issues with having more than one instance, supporting the singleton pattern.
	 * @return: This method returns a new MiddleEarthCouncil instance or an existing one.
	 */
	public static MiddleEarthCouncil getInstance() {
		if(instance == null) {
			instance = new MiddleEarthCouncil();
		}
		return instance;
	}
	
	/**
	 * This method allows the other classes to manage the characters using the council.
	 * @return: This method returns the character manager.
	 */
	public CharacterManager getCharacterManager() {
		return characterManager;
	}

}
