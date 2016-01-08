package Creational.BuilderRobot.Parts;

import Creational.BuilderRobot.Size;

/**
 * Created by al on 08.01.2016.
 */
public class Wheel implements Part {
    @Override
    public String name() {
        return "wheel";
    }

    @Override
    public Double cost() {
        return 10.;
    }

    @Override
    public Size size() {
        return new Size(3., 3., 1.);
    }
}
