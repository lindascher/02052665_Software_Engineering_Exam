import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public abstract class ZooMember {
    protected String name;
    protected int id;

    public ZooMember(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract int getNum();

    public abstract void drawPoint(Graphics g, Point location);

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

}
