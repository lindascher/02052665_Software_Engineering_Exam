import java.awt.*;

public class Drone extends ZooMember{
    public String name;
    public int freq;
    public int id;

    public Drone(String name, int freq, int id) {
        super(name,id);
        this.freq = freq;
    }

    public int getFreq() {
        return freq;
    }

    public void drawPoint(Graphics g, Point location) {
        g.setColor(Color.black);
        g.drawRect(location.x, location.y, 3, 3);
        g.drawString(name + ", " + freq + " Hz", location.x+3, location.y+3);
    }

}
