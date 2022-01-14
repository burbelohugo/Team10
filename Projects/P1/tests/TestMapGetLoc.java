import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.HashSet;

public class TestMapGetLoc extends TestCase{
	
	public void testMapGetLoc() throws FileNotFoundException{
		MainFrame frame = new MainFrame();
		Ghost ghost = frame.addGhost(new Location(1, 1), "name", Color.red);
		PacMan pacman = frame.addPacMan(new Location(2, 1));
		Map myMap = frame.getMap();

		assertTrue(myMap.getLoc(new Location(1, 1)).contains(Map.Type.GHOST));
		assertTrue(myMap.getLoc(new Location(2, 1)).contains(Map.Type.PACMAN));
		assertTrue(myMap.getLoc(new Location(0, 0)).contains(Map.Type.WALL));
		assertTrue(myMap.getLoc(new Location(3, 1)).contains(Map.Type.COOKIE));

		pacman.move();
		System.out.print(myMap.getLoc(new Location(2, 1)));
		//assertTrue(myMap.getLoc(new Location(2, 1)).contains(Map.Type.EMPTY));
	}
}
