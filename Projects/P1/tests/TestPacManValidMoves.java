import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;
public class TestPacManValidMoves extends TestCase {

	public void testPacManValidMoves() throws FileNotFoundException{
		MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
        //NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display
        PacMan pm1 = frame.addPacMan(new Location(9,12));
		ArrayList<Location> locations = new ArrayList<Location>();
		locations.add(new Location(9,12));
		locations.add(new Location(10,11));
		locations.add(new Location(10,12));
        assertEquals(pm1.get_valid_moves().toArray(), locations.toArray());
	}
}
