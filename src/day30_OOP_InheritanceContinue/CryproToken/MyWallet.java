package day30_OOP_InheritanceContinue.CryproToken;

import java.util.ArrayList;
import java.util.Arrays;

public class MyWallet {

    public static void main(String[] args) {

        CryptoToken coin1 = new Bitcoin(30000, 1, 324234212, 324234234, false);
        CryptoToken coin2 = new Ethereum(15000, 3, 123123, 123123, true);
        CryptoToken coin3 = new Cardano(100, 9, 123123, 123123, true);
        CryptoToken coin4 = new XRP(250, 20, 1123, 345345453, true);
        CryptoToken coin5 = new Doge(250, 3, 100000, 1, false);

        System.out.println(coin1);
        System.out.println(coin2);
        System.out.println(coin3);
        System.out.println(coin4);
        System.out.println(coin5);

        ArrayList<CryptoToken> list = new ArrayList<>(Arrays.asList(coin1, coin2, coin3, coin4, coin5));

        double total = 0;

        for (CryptoToken cryptoToken : list) {

            total += cryptoToken.totalPrice();
            
        }

        System.out.println("total = " + total);

    }

}
