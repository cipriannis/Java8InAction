package net.designpatterns.behavioral.strategy;

/**
 * Created by Ciprian Dumitrel on 1/29/2017.
 * In Strategy pattern, a class behavior or its algorithm can be changed at run time.
 * This type of design pattern comes under behavior pattern.
 * In Strategy pattern, objects which represent various strategies and a context object whose behavior varies as
 * per its strategy object are created.
 * The strategy object changes the executing algorithm of the context object.
 */

public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
