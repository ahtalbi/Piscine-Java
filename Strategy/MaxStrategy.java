public class MaxStrategy extends OperationStrategy {
    public int execute(int a, int b) {
        return (a > b) ? a : b;
    }
}