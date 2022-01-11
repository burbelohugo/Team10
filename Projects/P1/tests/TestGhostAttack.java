import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostAttack {
    public void testGhostAttack {
        Mainframe mainFrame = new Mainframe();
        NoFrame noFrame = new NoFrame();
        PacMan pacman = frame.addPacMan(new Location(1,1));
        
        Ghost pinky = frame.addGhost(new Location(1,2));
        assertTrue(pinky.attack());

        Ghost inky = frame.addGhost(new Location(4,5));
        assertFalse(inky.attack());
    }
}