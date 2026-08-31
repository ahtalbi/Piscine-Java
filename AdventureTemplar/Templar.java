public class Templar extends Character implements Healer, Tank {
	final private int healCapacity;
	final private int shield;

	public Templar(String name, int maxHealth, int healCapacity, int shield) {
		super(name, maxHealth);
		this.healCapacity = healCapacity;
		this.shield = shield;
	}

	// Getters
	public int getHealCapacity() {
		return this.healCapacity;
	}
	public int getShield() {
		return this.shield;
	}

	public void heal(Character c) {
		if (this.healCapacity + c.getCurrentHealth() > c.getMaxHealth()) {
			c.setCurrentHealth(c.getMaxHealth());
			return;
		}
		c.setCurrentHealth(c.getCurrentHealth()+this.healCapacity);
	}

	public String toString() {
	    if (this.getCurrentHealth() == 0) return String.format("%s has been beaten, even with its %d shield. So bad, it could heal %d HP.", this.getName(), this.shield, this.healCapacity);
	    return String.format("%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d.", this.getName(), this.getCurrentHealth(), this.healCapacity, this.shield);
	}
}
