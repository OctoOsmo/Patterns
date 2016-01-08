package Creational.BuilderRobot;

/**
 * Created by al on 08.01.2016.
 */
public class RobotBuilderMain {
    public static void main(String[] args) {
        RobotBuilder builder = new RobotBuilder();

        Robot copter = builder.buildQuadrocopter("Quadrocopter");
        System.out.println(copter.getName());
        copter.printParts(System.out);
        System.out.println("Total cost: " + copter.getCost());

        Robot drone = builder.buildDrone("Drone");
        System.out.println(drone.getName());
        drone.printParts(System.out);
        System.out.println("Total cost: " + drone.getCost());
    }
}
