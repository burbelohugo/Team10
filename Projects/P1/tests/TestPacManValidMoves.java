import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;
public class TestPacManValidMoves extends TestCase {

	public void testPacManValidMoves1() throws FileNotFoundException{
		//MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
        NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display
		Map map = frame.getMap();
		Location pmLoc = new Location(1,1);
		PacMan pm; 
		frame.addPacMan(pmLoc);
		pm = new PacMan("PacMan", pmLoc, map);
		ArrayList<Location> valid_moves = new ArrayList<Location>();
		ArrayList<Location> locations = new ArrayList<Location>();
		locations.add(new Location(2, 1));
		locations.add(new Location(1,2));
		valid_moves = pm.get_valid_moves();
		assertEquals(valid_moves.size(), locations.size());
		assertEquals(valid_moves.get(0).x, locations.get(0).x);
		assertEquals(valid_moves.get(0).y, locations.get(0).y);
		assertEquals(valid_moves.get(1).x, locations.get(1).x);
		assertEquals(valid_moves.get(1).y, locations.get(1).y);
	}
	public void testPacManValidMoves2() throws FileNotFoundException{
		//MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
        NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display
		Map map = frame.getMap();
		Location pmLoc = new Location(1,1);
		PacMan pm; 
		frame.addPacMan(pmLoc);
		pm = new PacMan("PacMan", pmLoc, map);
		ArrayList<Location> valid_moves = new ArrayList<Location>();
		ArrayList<Location> locations = new ArrayList<Location>();
		locations.add(new Location(2, 1));
		locations.add(new Location(1,2));
		valid_moves = pm.get_valid_moves();
		assertEquals(valid_moves.get(0).x, locations.get(0).x);
		assertEquals(valid_moves.get(0).y, locations.get(0).y);
	}

	public void testPacManValidMoves3() throws FileNotFoundException{
		//MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
        NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display
		Map map = frame.getMap();
		Location pmLoc = new Location(1,1);
		PacMan pm; 
		frame.addPacMan(pmLoc);
		pm = new PacMan("PacMan", pmLoc, map);
		ArrayList<Location> valid_moves = new ArrayList<Location>();
		ArrayList<Location> locations = new ArrayList<Location>();
		locations.add(new Location(2, 1));
		locations.add(new Location(1,2));
		valid_moves = pm.get_valid_moves();
		assertEquals(valid_moves.get(1).x, locations.get(1).x);
		assertEquals(valid_moves.get(1).y, locations.get(1).y);
	}
	public void testPacManValidMoves4() throws FileNotFoundException{
		//MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
        NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display
		Map map = frame.getMap();
		Location pmLoc = new Location(1,1);
		Location gLoc = new Location(1,2);
		PacMan pm; 
		Ghost g;
		frame.addGhost(gLoc, "Bob", Color.red);
		frame.addPacMan(pmLoc);
		pm = new PacMan("PacMan", pmLoc, map);
		g = new Ghost("Bob", gLoc, map);
		ArrayList<Location> valid_moves = new ArrayList<Location>();
		ArrayList<Location> locations = new ArrayList<Location>();
		locations.add(new Location(2, 1));
		//locations.add(new Location(1,2));
		valid_moves = pm.get_valid_moves();
		assertEquals(valid_moves.size(), 1);
		assertEquals(valid_moves.get(0).x, locations.get(0).x);
		assertEquals(valid_moves.get(0).y, locations.get(0).y);
	}
}

/* put pacman at 1,1 put ghost at 1,2 
0000000000000000000000000
0P11111111110111111111110
0101000000000000000001010
0101111111111111111111010
0101000000000000000101010
0101010111110111110101010
0101010101000000010101010
0101010101111111110101010
0101010101000001010101010
0101010101022201010101010
0101010101022201010101010
0101010001022201000101010
0100010100022211010100010
0101010101022201010101010
0101010101022201010101010
0101010101000001010101010
0101010101111111010101010
0101010101000001010101010
0101011111110111111101010
0101010000000000000001010
0101111111111111111111010
0100000000000000000001010
0111111111110111111111110
0000000000000000000000000

*/
