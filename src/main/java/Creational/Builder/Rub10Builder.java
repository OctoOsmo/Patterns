package Creational.Builder;

/**
 * Created by al on 08.01.2016.
 */
public class Rub10Builder extends CoinBuilder {
    @Override
    public void buildDiameter() {
        coin.diameter = 22;
    }

    @Override
    public void buildFaceValue() {
        coin.faceValue = 10;
    }

    @Override
    public void buildComposition() {
        coin.composition.add(CoinMaterials.Brass);
        coin.composition.add(CoinMaterials.Steel);
    }
}
