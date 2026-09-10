public class MaxStrategy implements OperationStrategy {
    public int execute(int a, int b) {
        return (a > b) ? a : b;
    }
}