public class StrategyApp {
    public static void main(String[] args) {
        Context context = new Context(new AddOperation());
        System.out.println("5 + 6 = " + context.executeStrategy(5, 6));
        Context context2 = new Context(new SubstractOperation());
        System.out.println("5 - 6 = " + context2.executeStrategy(5, 6));
        Context context3 = new Context(new MultiptyOperation());
        System.out.println("5 * 6 = " + context3.executeStrategy(5, 6));
    }

}