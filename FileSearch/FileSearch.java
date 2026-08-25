import java.nio.file.*;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class FileSearch {
	public static String searchFile(String fileName) {
		try {
			List<String> paths = Files.walk(Paths.get("documents"), Integer.MAX_VALUE).map(path -> path.toString()).collect(Collectors.toList());
			for (String path : paths) {
				if (path.endsWith(fileName)) {
					return path;
				}
			}
		} catch (Exception e) {
			return null;
		}

		return null;
	}
}
