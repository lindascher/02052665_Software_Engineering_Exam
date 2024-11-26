import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class MemberDB {
    ArrayList<ZooMember> members = new ArrayList<>();
    LocationSystem locationSystem = new LocationSystem();

    void addKeeper(String name, int id, int number) {
        members.add(new Keeper(name, id, number));
    }

    void addLion(String name, int id, int age) {
        members.add(new Lion(name, id, age));
    }

    void addDrone(String name, int id, int age) {
        members.add(new Drone(name, id, age));
    }

    public void makeMap(Graphics g) throws IOException {
        for (ZooMember member : members) {
            if (member instanceof Keeper) {
                Point location = locationSystem.getCoords(member.getID());
                member.drawPoint(g, location);
            }
            else if (member instanceof Lion) {
                Point location = locationSystem.getCoords(member.getID());
                member.drawPoint(g, location);
            }
            else if (member instanceof Drone) {
                Point location = locationSystem.getCoords(member.getID());
                member.drawPoint(g, location);
            }
            else {
                System.out.println("Unknown member type");
            }
        }
    }
}
