package Creational.BuilderRobot;

/**
 * Created by al on 08.01.2016.
 */
public class Size {
    private Double height = null;
    private Double width = null;
    private Double length = null;

    public Size(Double height, Double width, Double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }

    public Double getLength() {
        return length;
    }
}
