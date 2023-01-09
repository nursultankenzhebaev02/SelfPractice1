package day30_OOP_InheritanceContinue.CryproToken;

public class Cardano extends CryptoToken{

    public Cardano(double price, int quantity, int circulatingSupply, double marketCap, boolean isMineable) {
        super(price, quantity, circulatingSupply, marketCap, isMineable);
    }
}
