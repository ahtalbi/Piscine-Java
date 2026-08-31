public class Monster extends Character {
	public Monster(String name, int maxHealth, Weapon w) {
		super(name, maxHealth, w);
	}

	public String toString() {
		String res = (this.getCurrentHealth() > 0) ? String.format("%s is a monster with %d HP", this.getName(), this.getCurrentHealth()) : String.format("%s is a monster and is dead", this.getName());
		if (this.getWeapon() != null) {
			return res + " He has the weapon " + this.getWeapon().toString();
		}
		return res;
	}

	public void attack(Character c) throws DeadCharacterException {
		if (this.getCurrentHealth() == 0) throw new DeadCharacterException(this);
		if (c.getCurrentHealth() == 0) throw new DeadCharacterException(c);
		if (this.getWeapon() != null) {
			c.takeDamage(this.getWeapon().getDamage());
		} else {
			c.takeDamage(7);
		}
	}

	public void takeDamage(int damage) throws DeadCharacterException {
		if (this.getCurrentHealth() == 0) throw new DeadCharacterException(this);
		this.setCurrentHealth(this.getCurrentHealth() - (int)(damage * 0.8));
		if (this.getCurrentHealth() < 0) this.setCurrentHealth(0);
	}
}
