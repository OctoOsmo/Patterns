package Creational.Builder;

/**
 * Created by al on 08.01.2016.
 */
public class CoinPrinter {
    private CoinBuilder coinBuilder;

    public void setCoinBuilder(CoinBuilder coinBuilder) {
        this.coinBuilder = coinBuilder;
    }

    public Coin getCoin(){
        this.constructCoin();
        return coinBuilder.getCoin();
    }

    private void constructCoin(){
        coinBuilder.constructNewCoin();
        coinBuilder.buildDiameter();
        coinBuilder.buildFaceValue();
        coinBuilder.buildComposition();
    }
}
