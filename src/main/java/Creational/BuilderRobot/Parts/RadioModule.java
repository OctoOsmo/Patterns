package Creational.BuilderRobot.Parts;

import Creational.BuilderRobot.Size;

/**
 * Created by al on 08.01.2016.
 */
public class RadioModule implements Part {
    @Override
    public String name() {
        return "Radio";
    }

    @Override
    public Double cost() {
        return 7.;
    }

    @Override
    public Size size() {
        return new Size(1., 1., 1.);
    }
}
