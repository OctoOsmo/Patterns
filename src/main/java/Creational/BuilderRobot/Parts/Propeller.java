package Creational.BuilderRobot.Parts;

import Creational.BuilderRobot.Size;

/**
 * Created by al on 08.01.2016.
 */
public class Propeller implements Part {
    @Override
    public String name() {
        return "Propeller";
    }

    @Override
    public Double cost() {
        return 1.;
    }

    @Override
    public Size size() {
        return new Size(3., 3., 0.1);
    }
}
