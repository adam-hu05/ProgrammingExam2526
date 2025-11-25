package sensors;

import java.awt.*;

public class Humidifier extends Sensor{
    private int humOut;
    private int humIn;
    public Humidifier(String name, Point p, EnvironmentalSystem eSys){
        super(name, p, eSys);
    }
    @Override
    public void draw(Graphics g){
        g.drawString(getName(), getP().x, getP().y);
        g.drawString("Outside Humidity:" + geteSys().getHumidityFeed().getOutsideHumidity(), getP().x, getP().y -10);
        g.drawString("Inside Humidity:" + geteSys().getHumidityFeed().getInsideHumidity(), getP().x, getP().y -20);
    }
}
