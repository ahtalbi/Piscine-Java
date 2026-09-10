public class Context extends OperationStrategy {   
    private OperationStrategy operationStrategy;
    public Context() {
        this.operationStrategy = new AddStrategy();
    }

    public void changeStrategy(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    public int execute(int a, int b) {
        if (this.operationStrategy == null) return -1;
        return this.operationStrategy.execute(a, b);
    }
}