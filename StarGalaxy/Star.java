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

	@Override
	public boolean equals(Object obj) {
    	if (!(obj instanceof Star)) {
    	    return false;
    	}

    	Star objCasted = (Star) obj;

    	return super.equals(objCasted) && this.magnitude == objCasted.getMagnitude();
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
