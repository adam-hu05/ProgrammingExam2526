package sensors;

import java.awt.*;

public abstract class Sensor implements Draw{
    private String name;
    private Point p;
    private EnvironmentalSystem eSys = new EnvironmentalSystem();
    public Sensor(String name, Point p, EnvironmentalSystem eSys){
        this.name = name;
        this.p = p;
    }
    public String getName(){
        return name;
    }
    public Point getP(){
        return p;
    }
    public EnvironmentalSystem geteSys() {
        return eSys;
    }
}
