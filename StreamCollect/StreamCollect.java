import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Comparator;

public class StreamCollect {
	public static Map<Character, List<String>> mapByFirstLetter(Stream<String> s) {
		return s.collect(Collectors.groupingBy(str -> Character.toUpperCase(str.charAt(0))));
	}

	public static Map<Integer, Optional<Integer>> getMaxByModulo4(Stream<Integer> s) {
		return s.collect(Collectors.groupingBy(i -> i % 4, Collectors.maxBy(Comparator.naturalOrder())));
	}
	
	public static String orderAndConcatWithSharp(Stream<String> s) {
		return s.collect(Collectors.joining(" # "));
	}
}
