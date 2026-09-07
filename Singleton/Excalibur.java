public class Excalibur {
	private String name = "Sword";
	private static Excalibur INSTANCE;
	
	private Excalibur() {}
	private Excalibur(String n) {
		name = n;
	}
	
	public String getName() {
		return this.name;
	}

	public static Excalibur getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Excalibur();
		};
		return INSTANCE;
	}
	
	public static Excalibur getInstance(String name) {
		if (INSTANCE == null) {
			INSTANCE = new Excalibur(name);
		};
		return INSTANCE;
	}
}
