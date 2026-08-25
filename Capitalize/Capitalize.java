import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class Capitalize {
	public static void capitalize(String[] args) throws IOException {
		if (args == null || args.length != 2) return;
		if (args[0] == null) return;
		if (args[1] == null) return;
		Path oldPath = FileSystems.getDefault().getPath(args[0]);

		Scanner scanner = new Scanner(oldPath);
		OutputStream writer = new FileOutputStream(args[1]);

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] arr = line.split("\\s+");
			String res = "";
			boolean fw = false;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].length() > 0) {
					if (fw) {
					  	res += " ";
					}
					res += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase();
					fw = true;
				}
			}
			if (scanner.hasNextLine()) res += "\n";
			System.out.print(res);
			writer.write(res.getBytes());
		}
		scanner.close();
		writer.close();
	}
}
