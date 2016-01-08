package Creational.BuilderRobot.Parts;

import Creational.BuilderRobot.Size;

/**
 * Created by al on 08.01.2016.
 */
public class SensorArray implements Part {
    @Override
    public String name() {
        return "Sensors";
    }

    @Override
    public Double cost() {
        return 40.5;
    }

    @Override
    public Size size() {
        return new Size(.5, 1.5, .3);
    }
}
