import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostAttack extends TestCase {

    public void testGhostAttack1() throws FileNotFoundException {
        NoFrame frame = new NoFrame();
        PacMan pacman = frame.addPacMan(new Location(1,1));
        
        Ghost pinky = frame.addGhost(new Location(1,2), "pinky", Color.red);
        assertTrue(pinky.attack());

        Ghost inky = frame.addGhost(new Location(4,5), "inky", Color.red);
        assertFalse(inky.attack());
    }
}