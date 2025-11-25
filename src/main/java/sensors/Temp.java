package sensors;

import java.awt.*;

public class Temp extends Sensor{
    private int wardID;
    private int idealTemp; //In degrees centigrade
    public Temp(String name, int wardID, int idealTemp, Point p){
        super(name, p);
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
    }
}
