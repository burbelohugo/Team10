import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostMove extends TestCase {

	public void testGhostMove() throws FileNotFoundException {
		MainFrame frame = new MainFrame(); // Creates A New Map With Walls and Tokens Initialized
		Ghost g1 = frame.addGhost(new Location(2, 3), "Bob", Color.red);
		Ghost g2 = frame.addGhost(new Location(4, 3), "Linda", Color.cyan);
		assertTrue(g1.move());
		assertTrue(g2.move());
	}
}
