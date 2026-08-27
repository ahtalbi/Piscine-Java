import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

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

	public Map<String, Integer> computeMassRepartition() {
		Map<String, Integer> res = new HashMap<>();
		res.put("Star", 0);
		res.put("Planet", 0);
		res.put("Other", 0);
		for (CelestialObject obj: this.celestialObjects) {
			if (obj instanceof Star) {
				res.put("Star", res.get("Star") + obj.getMass());
			} else if (obj instanceof Planet) {
				res.put("Planet", res.get("Planet") + obj.getMass());
			} else {
				res.put("Other", res.get("Other") + obj.getMass());
			}
		}
		return res;
	}
}
