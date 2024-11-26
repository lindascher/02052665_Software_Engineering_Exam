import javax.swing.*;
import java.awt.*;

//Superclass of all Zoo Members - Keepers, Lions, and Drones
public abstract class ZooMember {
    protected String name;
    protected int id;

    public ZooMember(String name, int id) {
        this.name = name;
        this.id = id;
    }

    //For Keeper phone number, lion age, and drone freq
    public abstract int getNum();

    //Different for each Member
    public abstract void drawPoint(Graphics g, Point location);

    public int getID() {
        return id;
    }

}
