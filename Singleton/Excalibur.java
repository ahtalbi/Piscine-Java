public class Excalibur {
	private String name = "Sword";
	private static Excalibur instance;
	
	private Excalibur() {}
	
	public String getName() {
		return this.name;
	}

	public static Excalibur getInstance() {
		if (instance == null) {
			instance = new Excalibur();
		};
		return instance;
	}
}
