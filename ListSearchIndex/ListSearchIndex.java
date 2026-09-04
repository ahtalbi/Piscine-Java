import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        if (list == null) return null;
	int ind = list.lastIndexOf(value);
        return (ind == -1) ? null : ind;
    }
    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        if (list == null) return null;
	int ind = list.indexOf(value);
        return (ind == -1) ? null : ind;
    }
    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        List<Integer> res = new ArrayList<>();
        if (list == null) return res;
        for (int i = 0; i < list.size(); i++) {
            if (Objects.equals(list.get(i), value)) {
                res.add(i);
            }
        }
        return res;
    }
}
