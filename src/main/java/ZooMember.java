import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public abstract class ZooMember {
    protected String name;
    protected int id;
    private ArrayList<ZooMember> members = new ArrayList<>();
    private LocationSystem locationSystem = new LocationSystem();
    protected Point location;

    public ZooMember(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract void drawPoint(Graphics g, Point location);

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    void addKeeper(String name, int id, int age) {
        members.add(new Keeper(name, id, age));
    }

    void addLion(String name, int id, int age) {
        members.add(new Lion(name, id, age));
    }

    void addDrone(String name, int id, int age) {
        members.add(new Drone(name, id, age));
    }

    Point getLocation() throws IOException {
        location = locationSystem.getCoords(id);
        return location;
    }

}
