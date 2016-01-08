package Creational.BuilderRobot;

import Creational.BuilderRobot.Parts.Part;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by al on 08.01.2016.
 */
public class Robot {

    private String name;
    private ArrayList<Part> parts = new ArrayList<>();

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Part> getParts() {
        return parts;
    }

    public void setParts(ArrayList<Part> parts) {
        this.parts = parts;
    }

    public void addPart(Part part){
        parts.add(part);
    }

    public Double getCost(){
        Double cost = 0.;
        for (Part part : parts) {
            cost += part.cost();
        }
        return cost;
    }

    public void printParts(PrintStream printStream){
        for (Part part : parts) {
            printStream.println("\tPart name: " + part.name());
            printStream.println("\tcost: " + part.cost());
        }
    }
}
