public class ConcatStrategy implements OperationStrategy {
    public int execute(int a, int b) {
        String concatenated = "" + a + b;
        return Integer.parseInt(concatenated);
    }
}