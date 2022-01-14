import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapEatCookie extends TestCase {

	public void testMapEatCookie() throws FileNotFoundException {
		MainFrame frame = new MainFrame(); // Creates A New Map With Walls and Tokens Initialized
		PacMan pm1 = frame.addPacMan(new Location(1, 1));
		Ghost g1 = frame.addGhost(new Location(2, 3), "Bob", Color.red);
		Ghost g2 = frame.addGhost(new Location(4, 3), "Linda", Color.cyan);
		assertTrue(pm1.myMap.eatCookie(pm1.myName) != null); // Eat the cookie
		assertTrue(pm1.myMap.eatCookie(pm1.myName) == null); // Cookie has already been eaten
	}
}
