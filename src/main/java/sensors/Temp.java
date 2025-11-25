package sensors;

import java.awt.*;

public class Temp extends Sensor{
    private int wardID;
    private int idealTemp; //In degrees centigrade
    public Temp(String name, int wardID, int idealTemp, Point p, EnvironmentalSystem eSys){
        super(name, p, eSys);
        this.wardID = wardID;
        this.idealTemp = idealTemp;
    }
    public int getWardID(){
        return wardID;
    }
    public int getIdealTemp(){
        return idealTemp;
    }
    @Override
    public void draw(Graphics g){
        g.drawString(getName(), getP().x, getP().y);
        g.drawString(geteSys().getTempFeed().getTemperature(wardID), getP().x, getP().y -10);
    }
}
