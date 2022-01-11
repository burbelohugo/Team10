import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapMove {

	public void testMapMove() {
		Mainframe frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
		NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display
		PacMan pm1 = frame.addPacMan(new Location(1,1));
		Ghost g1 = frame.addGhost(new Location(2,3), "Bob", Color.red);
		Ghost g2 = frame.addGhost(new Location(4,3), "Linda", Color.cyan);
		assertTrue(move("Bob", new Location(1,2), Type.GHOST));
		assertFalse(move("Bob", new Location(4,3), Type.GHOST));
	}
}
