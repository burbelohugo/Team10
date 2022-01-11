import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapAttack {
    public void testMapAttack {
        Mainframe mainFrame = new Mainframe();
        NoFrame noFrame = new NoFrame();
        PacMan pacman = frame.addPacMan(new Location(1,1));
        
        Ghost pinky = frame.addGhost(new Location(1,2));
        assertTrue(mainFrame.getMap.attack("pinky"));

        Ghost inky = frame.addGhost(new Location(4,5));
        assertTrue(mainFrame.getMap.attack("inky"));
    }
}
