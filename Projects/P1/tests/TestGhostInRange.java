import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostInRange extends TestCase {

	public void testGhostInRange() throws FileNotFoundException{
		MainFrame frame = new MainFrame();
		Ghost ghost = frame.addGhost(new Location(1, 1), "name", Color.red);
		PacMan pacman = frame.addPacMan(new Location(2, 1));
		assertTrue(pacman.is_ghost_in_range());
	}
}

