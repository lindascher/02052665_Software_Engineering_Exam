import java.awt.*;

public class Drone extends ZooMember{
    public int freq;

    public Drone(String name, int id, int freq) {
        super(name,id);
        this.freq = freq;
    }

    public int getNum() {
        return freq;
    }

    public void drawPoint(Graphics g, Point location) {
        g.setColor(Color.black);
        g.drawRect(location.x, location.y, 3, 3);
        g.drawString("Name: " + name + ", Freq: " + freq + "MHz", location.x+3, location.y+3);
    }

}
