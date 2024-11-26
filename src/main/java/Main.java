import javax.swing.*;
import java.awt.*;

public class Main {
    static Map map = new Map();
    LocationSystem locationSystem = new LocationSystem();

    public static void main(String[] args) {
        map.addKeeper("Geoff", 80, 4392);
        map.addLion("Simba", 30, 7);
        map.addDrone("Monitor1", 124,128);

        JFrame frame = new JFrame();
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        mainPanel.add(map);
        frame.add(mainPanel);
        //frame.setVisible(true);

        //arbitrary length of loop for testing - changed to while true for real thing
        //Iterate over map's paint method to get location of members and print their trackers on the screen
        for (int i = 0; i<50; i++) {
            try {
                map.repaint();
                Thread.sleep(1000);
            }
            catch(Exception e) {
                e.printStackTrace();
            }
            finally {
                frame.setVisible(true);
            }
        }
    }


}
