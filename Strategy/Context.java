public class Context extends OperationStrategy {   
    private OperationStrategy operationStrategy;
    public void Context() {
        this.operationStrategy = new AddStrategy();
    }

    public void changeStrategy(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    public int execute(int a, int b) {
        return this.operationStrategy.execute();
    }
}