import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManConsume extends TestCase {

    public void testConsume1() throws FileNotFoundException {
        NoFrame frame = new NoFrame(); // Spawns cookies on all locations
        PacMan pacman = frame.addPacMan(new Location(1,1));

        // Making sure PacMan eats the cookie at his current location
        assertNotNull(pacman.consume());

        // Rechecking same location, now empty with no cookie
        assertNull(pacman.consume());
    }
}