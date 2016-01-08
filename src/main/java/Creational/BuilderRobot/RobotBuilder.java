package Creational.BuilderRobot;

import Creational.BuilderRobot.Parts.*;

/**
 * Created by al on 08.01.2016.
 */
public class RobotBuilder {
    public Robot buildQuadrocopter(String name){
        Robot quadrocopter = new Robot(name);
        quadrocopter.addPart(new Engine());
        quadrocopter.addPart(new Propeller());
        quadrocopter.addPart(new Engine());
        quadrocopter.addPart(new Propeller());
        quadrocopter.addPart(new Engine());
        quadrocopter.addPart(new Propeller());
        quadrocopter.addPart(new Engine());
        quadrocopter.addPart(new Propeller());
        quadrocopter.addPart(new RadioModule());
        return quadrocopter;
    }

    public Robot buildDrone(String name){
        Robot drone = new Robot(name);
        drone.addPart(new Engine());
        drone.addPart(new Propeller());
        drone.addPart(new Wheel());
        drone.addPart(new Wheel());
        drone.addPart(new Wheel());
        drone.addPart(new Wheel());
        drone.addPart(new Wing());
        drone.addPart(new Wing());
        drone.addPart(new SensorArray());
        return drone;
    }
}
