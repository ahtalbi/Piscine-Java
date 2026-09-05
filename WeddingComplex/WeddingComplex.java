import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class WeddingComplex {
    public static Map<String, String> createBestCouple(Map<String, List<String>> mans, Map<String, List<String>> womans) {
	int size = (mans.size() > womans.size()) ? womans.size() : mans.size();
	Map<String, String>  res = new HashMap<>();
	Map<String, Integer> mariages = new HashMap<>();

	for (Map.Entry<String, List<String>> man: mans.entrySet()) {
		String mkey = man.getKey();
		for (String woman : man.getValue()) {
			int score = 0;
			List<String> womanList = womans.get(woman);
		       	List<String> manList = mans.get(mkey);
	
			score = score + womanList.indexOf(mkey);
			score = score + manList.indexOf(woman);

			String keyMar = mkey + "-" + woman;
			mariages.put(keyMar, score);			
		}
	}

	List<String> mariagesList = mariages.entrySet().stream().sorted(Map.Entry.comparingByValue()).map(Map.Entry::getKey).toList();
	int i = 0;
	while (res.size() != size) {
		String[] mariage = mariagesList.get(i).split("-");
		String man = mariage[0];
		String woman = mariage[1];
		if (!res.containsKey(man)) {
			res.put(man, woman);
		}
		i++;
	}

	return res;
    }
}
