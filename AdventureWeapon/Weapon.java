public class Weapon {
	final private String name;
	final private int damage;

	public Weapon(String name, int damage) {
		this.name = name;
		this.damage = damage;
	}

	// Getters
	public String getName() {
		return this.name;
	}
	public int getDamage() {
		return this.damage;
	}

	public String toString() {
		return String.format("%s deals %d damages", this.getName(), this.getDamage());
	}
}
