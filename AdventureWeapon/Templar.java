public class Templar extends Character implements Healer, Tank {
	final private int healCapacity;
	final private int shield;

	public Templar(String name, int maxHealth, int healCapacity, int shield, Weapon w) {
		super(name, maxHealth, w);
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
		String res = (this.getCurrentHealth() == 0) 
			? String.format("%s has been beaten, even with its %d shield. So bad, it could heal %d HP.", this.getName(), this.shield, this.healCapacity)
			: String.format("%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d.", this.getName(), this.getCurrentHealth(), this.healCapacity, this.shield);
		if (this.getWeapon() != null) {
			return res + " He has the weapon " + this.getWeapon().toString();
		}
		return res;
	}

	public void attack(Character c) {
		this.heal(this);
		if (this.getWeapon() != null) {
			c.takeDamage(this.getWeapon().getDamage());
		} else {
			c.takeDamage(6);
		}
	}

	public void takeDamage(int damage) {
		if (damage - this.shield > this.getCurrentHealth()) {
			this.setCurrentHealth(0);
			return;
		}
		this.setCurrentHealth(this.getCurrentHealth() - (damage - this.shield));
	}

}
