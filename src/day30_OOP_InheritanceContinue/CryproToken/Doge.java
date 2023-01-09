package day30_OOP_InheritanceContinue.CryproToken;

public class Doge extends CryptoToken{

    public Doge(double price, int quantity, int circulatingSupply, double marketCap, boolean isMineable) {
        super(price, quantity, circulatingSupply, marketCap, isMineable);
    }
}
