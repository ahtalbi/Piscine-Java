public class DeadCharacterException extends Exception {
	private Character character;
	
	public DeadCharacterException(Character c) {
		this.character = c;
	}

	public String getMessage() {
		String type;
		
		if (this.character instanceof Sorcerer) {
			type = "sorcerer";
		} else if (this.character instanceof Monster) {
			type = "monster";
		} else if (this.character instanceof Templar) {
			type = "templar";
		} else {
			return "";
		}

		return String.format("The %s %s is dead.", type, this.character.getName());
	}
}
