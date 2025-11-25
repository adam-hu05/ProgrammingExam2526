package sensors;

import java.awt.*;

public class Air extends Sensor{
    public Air(String name, Point p, EnvironmentalSystem eSys){
        super(name, p, eSys);
    }
    @Override
    public void draw(Graphics g){
        g.drawString(getName(), getP().x, getP().y);
        g.drawString("Air Pollution:" + geteSys().getPollutionFeed().getPollution(), getP().x, getP().y-10);
    }
}

