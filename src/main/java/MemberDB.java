import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class MemberDB {
    ArrayList<ZooMember> members = new ArrayList<>();
    LocationSystem locationSystem = new LocationSystem();
    AlertSystem alertSystem = new AlertSystem();
    Point kLocation = new Point();
    Point lLocation = new Point();
    Point dLocation = new Point();

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
                kLocation = LocationSystem.getCoords(member.getID());
                member.drawPoint(g, kLocation);
            }
            else if (member instanceof Lion) {
                lLocation = LocationSystem.getCoords(member.getID());
                member.drawPoint(g, lLocation);
            }
            else if (member instanceof Drone) {
                dLocation = LocationSystem.getCoords(member.getID());
                member.drawPoint(g, dLocation);
            }
            else {
                System.out.println("Unknown member type");
            }

            if (Math.hypot(kLocation.x,lLocation.x) < 60 || Math.hypot(kLocation.y,lLocation.y) < 60) {
                for (ZooMember member2 : members) {
                    if (member2 instanceof Keeper) {
                        alertSystem.alertAKeeper(String.valueOf(member2.getNum()));
                    }
                    else if (member2 instanceof Drone) {
                        alertSystem.alertADrone(member2.getNum());
                    }
                }
            }
        }
    }
}
