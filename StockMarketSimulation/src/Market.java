
import java.util.ArrayList;
import java.util.Calendar;
import java.time.*;
import javafx.util.converter.LocalDateTimeStringConverter;

public class Market {

    private int netWorth;

    private int averageSharePrice;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private LocalDateTime currentDate;

    private int ftse;

    private EventSystem eventSystem;

    private TradingExchange stockExchange;

    private ArrayList<Client> client;

    private ArrayList<Company> companies;

    private ArrayList<Trader> traders;

    private MarketMode mode = MarketMode.UNDEFINED;

    public Market(String startDate, String endDate, ArrayList<Company> companies, ArrayList<Client> client, ArrayList<Trader> traders) {
        this.startDate = LocalDateTime.parse(startDate);
        this.endDate = LocalDateTime.parse(endDate);
        this.currentDate = this.startDate;
    }

    public int FTSE() {
        int calc = 0;
        for(Share s : stockExchange.getShares()){
            calc += s.getPrice() * s.getQuantity();
        }
        return calc;
    }

    public void pause() {
        throw new UnsupportedOperationException();
    }

    public void run() {
        Event currentEvent;
        while(currentDate.compareTo(endDate)!=0){
            currentDate.plusMinutes(15);
            currentEvent = eventSystem.poll(currentDate);
            if(currentEvent != null){
                riskPerm(currentEvent.getRisk());
            }
            runTraders();
        }
    }
    
    private void runTraders(){
        for(Trader t : traders){
            t.buy();
            t.sell();
        }
    }
    
    private void riskPerm(Risk risk){
        stockExchange.setRisk();
        
    }
    
    public String getStartDateTime(){
        return startDate.toString();
    }
    
    public String getEndDateTime(){
        return endDate.toString();
    }

    public void step() {
        throw new UnsupportedOperationException();
    }
}
