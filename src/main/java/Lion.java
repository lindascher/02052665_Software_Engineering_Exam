import java.awt.*;

public class Lion extends ZooMember {
    public String name;
    public int age;
    public int id;

    public Lion(String name, int id, int age) {
        super(name,id);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getID() {
        return id;
    }

    public void drawPoint(Graphics g, Point location) {
        g.setColor(Color.red);
        g.drawOval(location.x, location.y, 3, 3);
        g.drawString(name + ", " + age, location.x+3, location.y+3);
    }
}
