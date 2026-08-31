public class Sorcerer extends Character implements Healer {
	final private int healCapacity;

	// Getters
	public int getHealCapacity() {
		return this.healCapacity;
	}

	public Sorcerer(String name, int maxHealth, int healCapacity) {
		super(name, maxHealth);
		this.healCapacity = healCapacity;
	}

	public void heal(Character c) {
		if (this.healCapacity + c.getCurrentHealth() > c.getMaxHealth()) {
			c.setCurrentHealth(c.getMaxHealth());
			return;
		}
		c.setCurrentHealth(c.getCurrentHealth()+this.healCapacity);
	}

	@Override
	public String toString() {
		if (this.getCurrentHealth() != 0) {
			return String.format("%s is a sorcerer with %d HP. It can heal %d HP.", this.getName(), this.getCurrentHealth(), this.healCapacity);
		}
		return String.format("%s is a dead sorcerer. So bad, it could heal %d HP.", this.getName(), this.healCapacity);
	}
}
