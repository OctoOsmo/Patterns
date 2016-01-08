package Creational.Builder;

/**
 * Created by al on 08.01.2016.
 */
public class Rub2Builder extends CoinBuilder{
    @Override
    public void buildDiameter() {
        coin.diameter = 23;
    }

    @Override
    public void buildFaceValue() {
        coin.faceValue = 2;
    }

    @Override
    public void buildComposition() {
        coin.composition.add(CoinMaterials.Cupronickel);
    }
}
