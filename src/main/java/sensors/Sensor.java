package sensors;

import java.awt.*;

public abstract class Sensor implements Draw{
    private String name;
    private Point p;
    public Sensor(String name, Point p){
        this.name = name;
        this.p = p;
    }
    public String getName(){
        return name;
    }
    public Point getP(){
        return p;
    }
}
