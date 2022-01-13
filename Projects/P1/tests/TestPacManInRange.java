import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManInRange extends TestCase {

	public void testPacManInRange() throws FileNotFoundException{
		MainFrame frame = new MainFrame();
		Ghost ghost = frame.addGhost(new Location(1, 1), "name", Color.red);
		PacMan pacman = frame.addPacMan(new Location(2, 1));
		assertTrue(ghost.is_pacman_in_range());
		pacman.move();
		assertFalse(ghost.is_pacman_in_range());
	}
}
