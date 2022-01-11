import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManMove extends TestCase {

	public void testPacManMove() throws FileNotFoundException {
		Mainframe frame = new MainFrame(); // Creates A New Map With Walls and Tokens Initialized
		PacMan pm1 = frame.addPacMan(new Location(2, 2));
		assertTrue(pm.move(), true);
		Ghost g1 = frame.addGhost(new Location(2, 3), "Bob", Color.red);
		Ghost g2 = frame.addGhost(new Location(3, 2), "Linda", Color.cyan);
		assertFalse(pm1.move(), false);
	}
}
