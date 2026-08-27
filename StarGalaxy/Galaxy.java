import java.util.List;
import java.util.ArrayList;

public class Galaxy {
	private List<CelestialObject> celestialObjects;

	public Galaxy() {
		this.celestialObjects = new ArrayList<>();
	}

	public List<CelestialObject> getCelestialObjects() {
		return this.celestialObjects;
	}
	
	public void addCelestialObject(CelestialObject cobj) {
		this.celestialObjects.add(cobj);
	}
}
