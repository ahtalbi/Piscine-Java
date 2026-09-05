import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class Wedding {
    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
	int size = (first.size() > second.size()) ? second.size() : first.size();
	Map<String, String> res = new HashMap<>();
	List<String> f = new ArrayList<>(first);
	List<String> s = new ArrayList<>(second);
	
	for (int i = 0; i < size; i++) {
		res.put(f.get(i), s.get(i));
	}
	return res;
    }
}
