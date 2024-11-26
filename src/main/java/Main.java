import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;

public class Main {
    static Map map = new Map();

    public static void main(String[] args) {
        map.addKeeper("Geoff", 4392, 80);
        map.addLion("Simba", 7, 30);
        map.addDrone("Monitor1", 124,128);

        JFrame frame = new JFrame();
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        mainPanel.add(map);
        frame.add(mainPanel);
        frame.setVisible(true);

        for (int i = 0; i<50; i++) {
            map.repaint();
            try {
                Thread.sleep(1000);
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
    }


}
