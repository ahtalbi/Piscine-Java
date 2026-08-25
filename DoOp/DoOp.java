public class DoOp {
	public static String operate(String[] args) {
		if (args == null) {
			return "Error";
		}
		if (args.length != 3) {
			return "it depend on the input.";
		}

		try {
			int fd = Integer.parseInt(args[0]);	
			int sd = Integer.parseInt(args[2]);
			switch (args[1]) {
				case "+":
					return String.format("%d", fd + sd);
				case "-":
					return String.format("%d", fd - sd);
				case "*":
					return String.format("%d", fd * sd);
				case "/":
					return String.format("%d", fd / sd);
				case "%":
					return String.format("%d", fd % sd);
				default:
					return "Error";
			}
		} catch (ArithmeticException | NumberFormatException e) {
			return "Error";
		}
	}
}
