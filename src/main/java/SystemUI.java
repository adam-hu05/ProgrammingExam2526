import Feeds.HumidityFeed;
import Feeds.PollutionFeed;
import Feeds.TemperatureFeed;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SystemUI {
    public static void main(String[] args){
        SystemGrid sysGrid = new SystemGrid();

        //Create JFrame and add canvas to it
        JFrame f = new JFrame();
        f.setSize(600, 600);
        f.setVisible(true);
        f.add(sysGrid);

        // Add a window listener to end the program for when the window is closed
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

    }
}

