import java.util.List;
import java.util.ArrayList;

public class Galaxy {
	private List<CelestialObject> celestialObject;

	Galaxy() {
		this.celestialObject = new ArrayList<>();
	}

	public List<CelestialObject> getCelestialObjects() {
		return this.celestialObject;
	}
	
	public void addCelestialObject(CelestialObject cobj) {
		this.celestialObject.add(cobj);
	}
}
