package sensors;

import java.awt.*;

public class Air extends Sensor{
    public Air(String name, Point p){
        super(name, p);
    }
    @Override
    public void draw(Graphics g){
        g.drawString(getName(), getP().x, getP().y);
    }
}

