public class Monster extends Character {
	public Monster(String name, int maxHealth) {
		super(name, maxHealth);
	}

	public String toString() {
		return (this.getCurrentHealth() > 0) ? String.format("%s is a monster with %d HP", this.getName(), this.getCurrentHealth()) : String.format("%s is a monster and is dead", this.getName());
	}

	public void attack(Character c) {
		c.takeDamage(7);
	}

	public void takeDamage(int damage) {
	    this.setCurrentHealth(this.getCurrentHealth() - (int)(damage * 0.8));
	    if (this.getCurrentHealth() < 0) this.setCurrentHealth(0);
	}
}
