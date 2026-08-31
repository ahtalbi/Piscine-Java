public class Sorcerer extends Character implements Healer {
	final private int healCapacity;

	// Getters
	public int getHealCapacity() {
		return this.healCapacity;
	}

	public Sorcerer(String name, int maxHealth, int healCapacity, Weapon w) {
		super(name, maxHealth, w);
		this.healCapacity = healCapacity;
	}

	public void heal(Character c) throws DeadCharacterException {
		if (this.getCurrentHealth() == 0) throw new DeadCharacterException(this);
		if (c.getCurrentHealth() == 0) throw new DeadCharacterException(c);
		if (this.healCapacity + c.getCurrentHealth() > c.getMaxHealth()) {
			c.setCurrentHealth(c.getMaxHealth());
			return;
		}
		c.setCurrentHealth(c.getCurrentHealth()+this.healCapacity);
	}

	public String toString() {
		String res = (this.getCurrentHealth() != 0) 
			? String.format("%s is a sorcerer with %d HP. It can heal %d HP.", this.getName(), this.getCurrentHealth(), this.healCapacity)
			: String.format("%s is a dead sorcerer. So bad, it could heal %d HP.", this.getName(), this.healCapacity);
		if (this.getWeapon() != null) {
			return res + " He has the weapon " + this.getWeapon().toString();
		}
		return res;
	}

	public void attack(Character c) throws DeadCharacterException {
		if (this.getCurrentHealth() == 0) throw new DeadCharacterException(this);
		if (c.getCurrentHealth() == 0) throw new DeadCharacterException(c);
		this.heal(this);
		if (this.getWeapon() != null) {
			c.takeDamage(this.getWeapon().getDamage());
		} else {
			c.takeDamage(10);
		}
	}

	public void takeDamage(int damage) throws DeadCharacterException {
		if (this.getCurrentHealth() == 0) throw new DeadCharacterException(this);
		if (damage > this.getCurrentHealth()) {
			this.setCurrentHealth(0);
			return;
		}
		this.setCurrentHealth(this.getCurrentHealth() - damage);
	}
}
