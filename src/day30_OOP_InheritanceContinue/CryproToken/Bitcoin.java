package day30_OOP_InheritanceContinue.CryproToken;

public class Bitcoin extends CryptoToken{

    public Bitcoin(double price, int quantity, int circulatingSupply, double marketCap, boolean isMineable) {
        super(price, quantity, circulatingSupply, marketCap, isMineable);
    }

}

