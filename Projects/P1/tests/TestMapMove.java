import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapMove extends TestCase {

	public void testMapMove1() throws FileNotFoundException{
		NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display
		Map map = frame.getMap();
		PacMan pm; 
		Ghost g;
		Location pmLoc = new Location(1,1);
		Location gLoc = new Location(1,2);
		frame.addGhost(gLoc, "Bob", Color.red);
		frame.addPacMan(pmLoc);
		pm = new PacMan("PacMan", pmLoc, map);
		g = new Ghost("Bob", gLoc, map);
		assertTrue(map.move("Bob", new Location(1,1), Map.Type.GHOST));
		assertTrue(map.move("Bob", new Location(4,3), Map.Type.GHOST));
	}
	public void testMapMove2() throws FileNotFoundException{
		NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display
		Map map = frame.getMap();
		PacMan pm; 
		Ghost g;
		Location pmLoc = new Location(1,1);
		Location gLoc = new Location(1,2);
		frame.addGhost(gLoc, "Bob", Color.red);
		frame.addPacMan(pmLoc);
		pm = new PacMan("PacMan", pmLoc, map);
		g = new Ghost("Bob", gLoc, map);
		//Tries to move through a wall
		assertFalse(map.move("PacMan", new Location(0,0), Map.Type.PACMAN));
	}

	public void testMapMove3() throws FileNotFoundException{
		NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display
		Map map = frame.getMap();
		PacMan pm; 
		Ghost g;
		Location pmLoc = new Location(1,1);
		pm = new PacMan("PacMan", pmLoc, map);
		frame.addPacMan(pmLoc);
		//Tries to move through a wall
		assertFalse(map.move("PacMan", new Location(8,2), Map.Type.PACMAN));
	}
}
