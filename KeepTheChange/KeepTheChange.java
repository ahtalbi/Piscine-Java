import java.util.List;
import java.util.Set;
import java.util.Comparator;
import java.util.ArrayList;

public class KeepTheChange {
    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
    	List<Integer> vals = coins.stream().sorted(Comparator.reverseOrder()).toList();
	List<Integer> res = new ArrayList<>();
	for (int i = 0; i < vals.size(); i++) {
		int val = vals.get(i);
		while (amount - val >= 0) {
			res.add(val);
			amount = amount - val;
		}
	}
	return res;
    }
}
