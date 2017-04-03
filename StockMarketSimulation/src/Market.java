
import java.util.ArrayList;

public class Market {

    private int netWorth;

    private int averageSharePrice;

    private int startDate;

    private int endDate;

    private int currentDate;

    private int ftse;

    private Object eventSystem;

    private Object stockExchange;

    private ArrayList<Client> client;

    private ArrayList<Company> companies;

    private ArrayList<Trader> traders;

    private MarketMode mode;

    public Market() {
    }

    public int FTSE() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void pause() {
    }

    public void run() {
    }

    public void step() {
    }
}
