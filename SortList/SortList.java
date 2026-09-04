import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class SortList {
	public static List<Integer> sort(List<Integer> list) {
	    if (list == null) return new ArrayList<>();
	    return list.stream().sorted().toList(); 
	}
	
	public static List<Integer> sortReverse(List<Integer> list) {
	    if (list == null) return new ArrayList<>();
	    return list.stream().sorted(Comparator.reverseOrder()).toList();
	}
}
