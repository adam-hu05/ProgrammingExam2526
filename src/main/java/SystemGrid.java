import sensors.Air;
import sensors.Humidifier;
import sensors.Sensor;
import sensors.Temp;

import java.awt.*;
import java.util.ArrayList;

public class SystemGrid extends Canvas{
    private ArrayList<Sensor> sensors = new ArrayList<>();
    public SystemGrid(){
        EnvironmentalSystem eSys = new EnvironmentalSystem();
        setBackground(Color.white);
        setSize(600, 600);

        sensors.add((Sensor)new Temp("North Ward Temp", 0, 23, new Point(100, 100)));
        sensors.add((Sensor)new Temp("Central Ward Temp", 1, 22, new Point(100, 300)));
        sensors.add((Sensor)new Temp("South Ward Temp", 2, 20, new Point(300, 100)));
        sensors.add((Sensor)new Humidifier("Humidity", new Point(300, 300)));
        sensors.add((Sensor)new Air("Air Pollution", new Point(300, 500)));
    }
    public void paint(Graphics g){
        for (Sensor sensor: sensors){
            sensor.draw(g);
        }
    }
}
