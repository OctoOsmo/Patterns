package Creational.BuilderRobot.Parts;

import Creational.BuilderRobot.Size;

/**
 * Created by al on 08.01.2016.
 */
public class Engine implements Part{
    @Override
    public String name() {
        return "Engine";
    }

    @Override
    public Double cost() {
        return 8.53;
    }

    @Override
    public Size size() {
        return new Size(2.5, 2.5, 3.);
    }
}
