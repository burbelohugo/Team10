import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapAttack extends TestCase {

    public void testMapAttack() throws FileNotFoundException {
        NoFrame frame = new NoFrame();
        PacMan pacman = frame.addPacMan(new Location(1,1));
        
        Ghost pinky = frame.addGhost(new Location(1,2), "pinky", Color.red);
        assertTrue(frame.getMap().attack("pinky"));

        Ghost inky = frame.addGhost(new Location(4,5), "inky", Color.red);
        assertTrue(!(frame.getMap().attack("inky")));
    }
}
