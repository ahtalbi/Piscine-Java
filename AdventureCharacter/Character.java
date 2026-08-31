public class Character {
	final private String name;
	final private int maxHealth;
	private int currentHealth;
	
	Character(String name, int maxHealth) {
		this.name = name;
		this.maxHealth = maxHealth;
		this.currentHealth = maxHealth;
	}

	public String getName() {
		return this.name;
	}
	public int getCurrentHealth() {
		return this.currentHealth;
	}
	public int getMaxHealth() {
		return this.maxHealth;
	}

	public String toString() {
		if (this.currentHealth == 0) {
			return String.format("%s : KO", this.name);
		}
		return String.format("%s : %d/%d", this.name, this.currentHealth, this.maxHealth);
	}

	public void attack(Character chr) {
		chr.takeDamage(9);
	}

	public void takeDamage(int damage) {
		if (damage > this.currentHealth) {
			this.currentHealth = 0;
			return;
		}
		this.currentHealth = this.currentHealth - damage;
	}
}
