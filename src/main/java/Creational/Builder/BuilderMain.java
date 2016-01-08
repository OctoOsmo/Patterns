package Creational.Builder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by al on 08.01.2016.
 */
public class BuilderMain {

    public static void main(String[] args) {
        CoinPrinter coinPrinter = new CoinPrinter();

        coinPrinter.setCoinBuilder(new Rub2Builder());
        System.out.println(coinPrinter.getCoin());

        coinPrinter.setCoinBuilder(new Rub10Builder());
        System.out.println(coinPrinter.getCoin());

        coinPrinter.setCoinBuilder(new Rub5Builder());
        System.out.println(coinPrinter.getCoin());
    }
}
