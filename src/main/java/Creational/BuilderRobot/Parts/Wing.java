package Creational.BuilderRobot.Parts;

import Creational.BuilderRobot.Size;

/**
 * Created by al on 08.01.2016.
 */
public class Wing implements Part {
    @Override
    public String name() {
        return "Wing";
    }

    @Override
    public Double cost() {
        return 50.;
    }

    @Override
    public Size size() {
        return new Size(1., 4., .2);
    }
}
