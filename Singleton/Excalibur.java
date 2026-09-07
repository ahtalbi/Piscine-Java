public class Excalibur {
	private String name = "Sword";
	private static Excalibur instance;
	
	private Excalibur() {}
	private Excalibur(String n) {
		name = n;
	}
	
	public String getName() {
		return this.name;
	}

	public static Excalibur getInstance() {
		if (instance == null) {
			instance = new Excalibur();
		};
		return instance;
	}
	
	public static Excalibur getInstance(String name) {
		if (instance == null) {
			instance = new Excalibur(name);
		};
		return instance;
	}
}
