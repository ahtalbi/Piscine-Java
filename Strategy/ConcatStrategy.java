public class ConcatStrategy extends OperationStrategy {
    public int execute(int a, int b) {
        String concatenated = "" + a + b;
        return Integer.parseInt(concatenated);
    }
}