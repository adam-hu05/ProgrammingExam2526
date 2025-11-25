package sensors;

import java.awt.*;

public class Humidifier extends Sensor{
    private int humOut;
    private int humIn;
    public Humidifier(String name, Point p){
        super(name, p);
    }
    @Override
    public void draw(Graphics g){
        g.drawString(getName(), getP().x, getP().y);
    }
}
