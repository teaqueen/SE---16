public class Share {

    private ShareType type;

    private int quantity;

    private int price;

    private Risk risk;

    private Company owner;
    
    public Share(int price, int quantity, Company issuingCompany){
        this.quantity = quantity;
        this.price = price;
        this.owner = issuingCompany;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public int getPrice(){
        return price;
    }
    
    public Company getIssuingCompany(){
        return owner;
    }
}
