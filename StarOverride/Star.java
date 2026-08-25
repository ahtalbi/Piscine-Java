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
	public boolean equals(Object o) {
    	if (this == o) return true;
    	if (o == null || getClass() != o.getClass()) return false;
    	if (!super.equals(o)) return false; // if inheriting x, y, z from a superclass

    	Star star = (Star) o;
    	return Double.compare(star.magnitude, magnitude) == 0;
	}

	@Override
	public String toString() {
		return String.format("%s shines at the %.3f magnitude", getName(), this.magnitude		);
	}

	public double getMagnitude() {
		return this.magnitude;
	}

	public void setMagnitude(double magnitude) {
		this.magnitude = magnitude;
	}
}
