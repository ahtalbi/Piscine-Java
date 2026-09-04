import java.util.Map;

public class MapEquals {
    public static boolean areMapsEqual(Map<String, Integer> map1, Map<String, Integer> map2) {
        if (map1 == null && map2 == null) return true;
        if (map1 == null || map2 == null) return false;
        if (map1.size() != map2.size()) return false;
        for (Map.Entry<String, Integer> mp : map1.entrySet()) {
            if (!map2.containsKey(mp.getKey())) return false;
            if (!mp.getValue().equals(map2.get(mp.getKey()))) return false;
        }
        return true;
    }
}
