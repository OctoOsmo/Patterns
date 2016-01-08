package Creational.Builder;

import java.util.ArrayList;

/**
 * Created by al on 08.01.2016.
 */
public class Coin {
    double diameter; //in millimeters
    Integer faceValue;
    ArrayList<CoinMaterials> composition = new ArrayList<>();

    @Override
    public String toString(){
        String res = "";
        res += "Diameter = " + diameter;
        res += ", face value = " + faceValue;
        res += ", coin materials = ";
        for (CoinMaterials coinMaterial : composition) {
            res += coinMaterial + " ";
        }
        return res;
    }
}
