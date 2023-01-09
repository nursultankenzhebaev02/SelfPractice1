package day30_OOP_InheritanceContinue.CryproToken;

public class CryptoToken {

    private double price;
    private int quantity, circulatingSupply;
    private double marketCap;
    private boolean isMineable;

    public CryptoToken(double price, int quantity, int circulatingSupply, double marketCap, boolean isMineable) {
        setPrice(price);
        setQuantity(quantity);
        setCirculatingSupply(circulatingSupply);
        setMarketCap(marketCap);
        setMineable(isMineable);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price <= 0){

            System.err.println("Price can not be zero or negative");
            System.exit(1);
        }

        this.price = price;
    }

    public boolean isMineable() {
        return isMineable;
    }

    public void setMineable(boolean mineable) {
        isMineable = mineable;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(double marketCap) {


        if (marketCap == 0) {
            System.err.println("Quantity can not be set to negative");
            System.exit(1);
        }
        this.marketCap = marketCap;
    }

    public int getCirculatingSupply() {
        return circulatingSupply;
    }

    public void setCirculatingSupply(int circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {

        if (quantity < 0){

            System.err.println("Quantity can nt set to negative");

        }

        this.quantity = quantity;
    }

    public double totalPrice(){
        return price*quantity;
    }


    @Override
    public String toString() {
        return "CryptoToken{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", circulatingSupply=" + circulatingSupply +
                ", marketCap=" + marketCap +
                ", isMineable=" + isMineable +
                ", totalPrice=" + totalPrice() +
                '}';

    }
}
