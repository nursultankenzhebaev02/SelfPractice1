package day30_OOP_InheritanceContinue.CryproToken;

public class Ethereum extends CryptoToken {

    public Ethereum(double price, int quantity, int circulatingSupply, double marketCap, boolean isMineable) {
        super(price, quantity, circulatingSupply, marketCap, isMineable);
    }
}
