public class Star extends CelestialObject {
	private double magnitude;

	public Star() {
		super();
		this.magnitude = 0.0;
	}

	public Star(String name, double x, double y, double z, double magnitude) {
		super(name, x, y, z);
		this.magnitude = magnitude;
	}

    @Override
	public int hashCode() {
		return java.util.Objects.hash(super.hashCode(), this.magnitude);
	}

	
	public boolean equals(Star object) {
		if (!(object instanceof Star)) {
			return false;
		}
		
		return super.equals(object) && this.magnitude == object.magnitude;
	}

	@Override
	public String toString() {
		return String.format("%s shines at the %.3f magnitude", getName(), this.magnitude);
	}

	public double getMagnitude() {
		return this.magnitude;
	}

	public void setMagnitude(double magnitude) {
		this.magnitude = magnitude;
	}
}
