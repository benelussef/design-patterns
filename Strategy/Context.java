public class Context {
    private StrategyOperation strategyOperation;

    public Context(StrategyOperation strategyOperation) {
        this.strategyOperation = strategyOperation;
    }

    int executeStrategy(int a , int b){
        return strategyOperation.doOperation(a,b);
    }
}
