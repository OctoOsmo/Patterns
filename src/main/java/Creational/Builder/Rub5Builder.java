package Creational.Builder;

/**
 * Created by al on 08.01.2016.
 */
public class Rub5Builder extends CoinBuilder {
    @Override
    public void buildDiameter() {
        coin.diameter = 25;
    }

    @Override
    public void buildFaceValue() {
        coin.faceValue = 5;
    }

    @Override
    public void buildComposition() {
        coin.composition.add(CoinMaterials.Nickel);
        coin.composition.add(CoinMaterials.Steel);
    }
}
