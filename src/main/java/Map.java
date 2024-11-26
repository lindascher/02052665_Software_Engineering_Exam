import java.awt.*;
import java.io.IOException;

public class Map extends Canvas {
    private MemberDB memberDB = new MemberDB();

    public void addKeeper(String name, int id, int number) {
        memberDB.addKeeper(name, id, number);
    }

    public void addLion(String name, int id, int age) {
        memberDB.addLion(name, id, age);
    }

    public void addDrone(String name, int id, int freq) {
        memberDB.addDrone(name, id, freq);
    }

    @Override
    public void paint(Graphics g) {
        try {
            memberDB.makeMap(g);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
