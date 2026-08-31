import java.util.List;
import java.util.ArrayList;

public abstract class Character {
	final private String name;
	final private int maxHealth;
	private int currentHealth;
	private static List<Character> allCharacters = new ArrayList<>();

	public Character(String name, int maxHealth) {
		this.name = name;
		this.maxHealth = maxHealth;
		this.currentHealth = maxHealth;

		allCharacters.add(this);
	}
	
	// Getters
	public String getName() {
		return this.name;
	}
	public int getCurrentHealth() {
		return this.currentHealth;
	}
	public int getMaxHealth() {
		return this.maxHealth;
	}

	// Setters
	public void setCurrentHealth(int ch) {
		this.currentHealth = ch;
	}

	public String toString() {
		if (this.currentHealth == 0) {
			return String.format("%s : KO", this.name);
		}
		return String.format("%s : %d/%d", this.name, this.currentHealth, this.maxHealth);
	}

	public abstract void attack(Character chr);
	public abstract void takeDamage(int damage);

	public static String printStatus() {
		if (allCharacters.size() == 0) {
			return "------------------------------------------\nNobody's fighting right now !\n------------------------------------------\n";
		}
		String res = "";
		res += "------------------------------------------\nCharacters currently fighting :\n";
		for (Character c: allCharacters) {
			res += String.format(" - %s\n", c.toString());
		}
		
		res += "------------------------------------------\n";
		return res;
	}

	public static Character fight(Character c1, Character c2) {
		while (c1.getCurrentHealth() > 0 && c2.getCurrentHealth() > 0) {
			c1.attack(c2);

			if (c2.getCurrentHealth() <= 0) {
				return c1;
			}

			c2.attack(c1);
		}

		return (c1.getCurrentHealth() == 0) ? c2 : c1;
	}
}
