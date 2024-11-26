import java.awt.*;

public class Lion extends ZooMember {
    public int age;

    public Lion(String name, int id, int age) {
        super(name,id);
        this.age = age;
    }

    public int getNum() {
        return age;
    }

    public void drawPoint(Graphics g, Point location) {
        g.setColor(Color.red);
        g.drawOval(location.x, location.y, 3, 3);
        g.drawString(name + ", " + age, location.x+3, location.y+3);
    }
}
