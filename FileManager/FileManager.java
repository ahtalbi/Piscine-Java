import java.nio.file.*;
import java.io.IOException;
public class FileManager {
	public static void createFile(String fileName, String content) throws IOException {
		Path path = Paths.get(fileName);
		try {
			Files.writeString(path, content);
		} catch (IOException e) {
			return;
		}
	}

	public static String getContentFile(String fileName) throws IOException {
		return Files.readString(Paths.get(fileName));
	}

	public static void deleteFile(String fileName) {
		try {
			Files.delete(Paths.get(fileName));
		} catch (IOException e) {
			return;
		}
	}
}
