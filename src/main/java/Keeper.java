import java.awt.*;

public class Keeper extends ZooMember {
    public int number;

    public Keeper(String name, int id, int number) {
        super(name, id);
        this.number = number;
    }

    public int getNum() {
        return number;
    }

    public void drawPoint(Graphics g, Point location) {
        g.setColor(Color.blue);
        g.drawOval(location.x, location.y, 2, 2);
        g.drawString("Name: " + name + ", Phone Number: " + number, location.x+3, location.y+3);
    }

}
