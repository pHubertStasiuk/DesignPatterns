package strategy;


public class StrategyFactory {
    public InterestCalculatorStrategy createStrategy(String strategyType) {
        InterestCalculatorStrategy strategy = null;
        if (strategyType != null) {
            if ("COMPOUND".equalsIgnoreCase(strategyType)) {
                strategy = new CompoundInterestCalculator();
            } else if ("SIMPLE".equalsIgnoreCase(strategyType)) {
                strategy = new SimpleInterestCalculator();
            } else {
                System.err.println("Unknown/unsupported strategy-type");
            }
        }
        return strategy;
    }
}