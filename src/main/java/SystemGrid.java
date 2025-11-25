import sensors.Air;
import sensors.Humidifier;
import sensors.Sensor;
import sensors.Temp;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SystemGrid extends Canvas{
    private ArrayList<Sensor> sensors = new ArrayList<>();
    JPanel mainPanel = new JPanel();
    public SystemGrid(){
        EnvironmentalSystem eSys = new EnvironmentalSystem();
        mainPanel.setBackground(Color.white);
        mainPanel.setSize(600, 600);
        mainPanel.setLayout(new GridLayout(3, 2));

        sensors.add((Sensor)new Temp("North Ward Temp", 0, 23, new Point(100, 100), eSys));
        sensors.add((Sensor)new Temp("Central Ward Temp", 1, 22, new Point(100, 300), eSys));
        sensors.add((Sensor)new Temp("South Ward Temp", 2, 20, new Point(300, 100), eSys));
        sensors.add((Sensor)new Humidifier("Humidity", new Point(300, 300), eSys));
        sensors.add((Sensor)new Air("Air Pollution", new Point(300, 500), eSys));

        //Each sensor should be a JPanel instead to add to mainPanel?
        //Then use JLabels for the text
    }
    public void paint(Graphics g){
        for (Sensor sensor: sensors){
            sensor.draw(g);
        }
    }
}
