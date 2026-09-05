import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class WeddingComplex {
    public static Map<String, String> createBestCouple( Map<String, List<String>> mans, Map<String, List<String>> womans) {
        int size = (mans.size() > womans.size()) ? womans.size() : mans.size();

        Map<String, String> res = new HashMap<>();
        Map<String, String> mariages = new HashMap<>();
        Map<String, Integer> nextProposal = new HashMap<>();

        for (String man : mans.keySet()) {
            nextProposal.put(man, 0);
        }

        while (res.size() < size) {

            for (Map.Entry<String, List<String>> man : mans.entrySet()) {
                String mkey = man.getKey();
                if (res.containsKey(mkey)) {
                    continue;
                }

                List<String> preferences = man.getValue();
                int index = nextProposal.get(mkey);

                if (index >= preferences.size()) {
                    continue;
                }

                String woman = preferences.get(index);
                nextProposal.put(mkey, index + 1);
                if (!mariages.containsKey(woman)) {
                    mariages.put(woman, mkey);
                    res.put(mkey, woman);
                    continue;
                }

                String oldMan = mariages.get(woman);
                List<String> womanPreferences = womans.get(woman);

                int newManRank = womanPreferences.indexOf(mkey);
                int oldManRank = womanPreferences.indexOf(oldMan);

                if (newManRank < oldManRank) {

                    mariages.put(woman, mkey);

                    res.remove(oldMan);
                    res.put(mkey, woman);
                }
            }
        }

        return res;
    }
}