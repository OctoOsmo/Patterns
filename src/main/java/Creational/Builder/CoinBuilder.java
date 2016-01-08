package Creational.Builder;

/**
 * Created by al on 08.01.2016.
 */
public abstract class CoinBuilder {
    protected Coin coin;

    public void constructNewCoin(){
        coin = new Coin();
    }

    public Coin getCoin() {
        return coin;
    }

    public abstract void buildDiameter();
    public abstract void buildFaceValue();
    public abstract void buildComposition();
}
