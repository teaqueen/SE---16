public class RandomTrader extends Trader {

    private TraderMode mode;

    private Double probabilityBalance;

    private Double probabilityAggressiveSeller;

    private Double probabilityAggressiveBuyer;

    public RandomTrader() {
    }

    public TraderMode switchMode() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
