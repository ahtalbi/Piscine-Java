import java.io.*;
import java.nio.file.*;

public class CatInFile {
	public static void cat(String[] args) throws IOException {
		if (args == null || args.length == 0) {
			return;
		}
		
		byte[] inputBytes = System.in.readAllBytes();

        Files.write(Paths.get(args[0]), inputBytes);
	}
}
