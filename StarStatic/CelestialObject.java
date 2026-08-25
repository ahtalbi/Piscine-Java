import java.lang.Math;

public class CelestialObject {
	private double x;
	private double y;
	private double z;
	private String name;
	public static final double KM_IN_ONE_AU = 150_000_000;

	public CelestialObject() {
		this.x = 0.0;
		this.y = 0.0;
		this.z = 0.0;
		this.name = "Soleil";
		
	}

	public CelestialObject(String name, double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.name = name;
	}

	public static double getDistanceBetween(CelestialObject fthis, CelestialObject sthis) {
		double dx = sthis.getX() - fthis.getX();
		double dy = sthis.getY() - fthis.getY();
		double dz = sthis.getZ() - fthis.getZ();
	
		return Math.sqrt(dx * dx + dy * dy + dz * dz);
	}
	
	public static double getDistanceBetweenInKm(CelestialObject fthis, CelestialObject sthis) {
		double dx = sthis.getX() - fthis.getX();
		double dy = sthis.getY() - fthis.getY();
		double dz = sthis.getZ() - fthis.getZ();
	
		double distanceAu = Math.sqrt(dx * dx + dy * dy + dz * dz);

		return distanceAu * KM_IN_ONE_AU;
	}

	// SETTERS AND GETTERS
	// X
	public double getX() {
		return this.x;
	}

	public void setX(double x) {
		this.x = x;
	}

	// Y
	public double getY() {
		return this.y;
	}

	public void setY(double y) {
		this.y = y;
	}

	// Z
	public double getZ() {
		return this.z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	// NAME
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
