import java.io.*;

public class ExerciseRunner {
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream outPutStream = new ByteArrayOutputStream();
		PrintStream printStream = new PrintStream(outPutStream);

		PrintStream	defaultOut = System.out;
		
		System.setOut(printStream);
		SortArgs.sort(new String[]{"4", "2", "1", "3"});
		System.setOut(defaultOut);

		String output = outPutStream.toString();
		System.out.println(output.equals("1 2 3 4\n"));
	}
}
