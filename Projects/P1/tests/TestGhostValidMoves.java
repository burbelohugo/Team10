import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;
public class TestGhostValidMoves extends TestCase {

	public void testGhostValidMoves1() throws FileNotFoundException{
		//MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
        NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display
		Map map = frame.getMap();
		Location gLoc = new Location(1,1);
		Ghost g; 
		frame.addGhost(gLoc, "Bob", Color.red);
		g = new Ghost("Bob", gLoc, map);
		ArrayList<Location> valid_moves = new ArrayList<Location>();
		ArrayList<Location> locations = new ArrayList<Location>();
		locations.add(new Location(2, 1));
		locations.add(new Location(1,2));
		valid_moves = g.get_valid_moves();
		assertEquals(valid_moves.size(), locations.size());
		assertEquals(valid_moves.get(0).x, locations.get(0).x);
		assertEquals(valid_moves.get(0).y, locations.get(0).y);
		assertEquals(valid_moves.get(1).x, locations.get(1).x);
		assertEquals(valid_moves.get(1).y, locations.get(1).y);
	}

	public void testGhostValidMoves2() throws FileNotFoundException{
		//MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
        NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display
		Map map = frame.getMap();
		Location gLoc = new Location(1,1);
		Ghost g; 
		frame.addGhost(gLoc, "Bob", Color.red);
		g = new Ghost("Bob", gLoc, map);
		ArrayList<Location> valid_moves = new ArrayList<Location>();
		ArrayList<Location> locations = new ArrayList<Location>();
		locations.add(new Location(2, 1));
		locations.add(new Location(1,2));
		valid_moves = g.get_valid_moves();
		assertEquals(valid_moves.get(0).x, locations.get(0).x);
		assertEquals(valid_moves.get(0).y, locations.get(0).y);
	}

	public void testGhostMoves3() throws FileNotFoundException{
		//MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
        NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display
		Map map = frame.getMap();
		Location gLoc = new Location(1,1);
		Ghost g; 
		frame.addGhost(gLoc, "Bob", Color.red);
		g = new Ghost("Bob", gLoc, map);
		ArrayList<Location> valid_moves = new ArrayList<Location>();
		ArrayList<Location> locations = new ArrayList<Location>();
		locations.add(new Location(2, 1));
		locations.add(new Location(1,2));
		valid_moves = g.get_valid_moves();
		assertEquals(valid_moves.get(1).x, locations.get(1).x);
		assertEquals(valid_moves.get(1).y, locations.get(1).y);
	}
	public void testGhostValidMoves4() throws FileNotFoundException{
		//MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
        NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display
		Map map = frame.getMap();
		Location pmLoc = new Location(1,2);
		Location gLoc = new Location(1,1);
		PacMan pm; 
		Ghost g;
		frame.addGhost(gLoc, "Bob", Color.red);
		frame.addPacMan(pmLoc);
		pm = new PacMan("PacMan", pmLoc, map);
		g = new Ghost("Bob", gLoc, map);
		ArrayList<Location> valid_moves = new ArrayList<Location>();
		ArrayList<Location> locations = new ArrayList<Location>();
		locations.add(new Location(2, 1));
		locations.add(new Location(1,2));
		valid_moves = g.get_valid_moves();
		assertEquals(valid_moves.size(), 2);
		assertEquals(valid_moves.get(0).x, locations.get(0).x);
		assertEquals(valid_moves.get(0).y, locations.get(0).y);
	}

	
}
