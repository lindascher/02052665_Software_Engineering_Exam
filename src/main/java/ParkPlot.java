import javax.swing.*;
import java.awt.*;

public class ParkPlot extends JPanel {
    private JPanel mainPanel;
    private Map map;

    public ParkPlot() {
        this.mainPanel = new JPanel();
        this.map = new Map();

        mainPanel.add(map);
    }
}
