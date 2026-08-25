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
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
   	    Star obj1 = (Star) obj;
	    return Double.compare(this.getX(), obj1.getX()) == 0 && Double.compare(this.getY(), obj1.getY()) == 0 && Double.compare(this.getZ(), obj1.getZ()) == 0 && this.getName().equals(obj1.getName()) && Double.compare(this.magnitude, obj1.magnitude) == 0 && obj1 != null;
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
