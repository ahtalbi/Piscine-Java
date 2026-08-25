import java.io.*;
import java.nio.file.*;

public class Cat {
	public static void cat(String[] args) throws IOException {
		PrintStream stdout = System.out;
		if (args == null || args.length == 0) {
			return;
		}
		
		for (String path: args) {
			Path sourcePath = Paths.get(path);
			try {
				Files.copy(sourcePath, stdout);
			} catch (IOException e) {
				return;
			}
		}
	}
}
