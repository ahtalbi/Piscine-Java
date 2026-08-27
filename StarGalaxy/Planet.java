public class Planet extends CelestialObject {
	private Star centerStar;

	public Planet() {
		super();
		this.centerStar = new Star();
	}

	public Planet(String name, double x, double y, double z, Star centerStar) {
		super(name, x, y, z);
		this.centerStar = centerStar;
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(super.hashCode(), this.centerStar);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Planet)) {
			return false;
		}
		Planet objCasted = (Planet) obj;
		return super.equals(objCasted) && this.centerStar.equals(objCasted.getCenterStar());
	}

	@Override
	public String toString() {
		double distance = CelestialObject.getDistanceBetween(this, this.centerStar);
		return String.format("%s circles around %s at the %.3f AU", getName(), this.centerStar.getName(), distance);
	}

	public Star getCenterStar() {
		return this.centerStar;
	}

	public void setCenterStar(Star centerStar) {
		this.centerStar = centerStar;
	}
}
