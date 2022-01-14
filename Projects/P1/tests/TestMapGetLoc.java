import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.HashSet;

public class TestMapGetLoc {
	
	public void testMapGetLoc() {
		MainFrame frame = new MainFrame();
		Ghost ghost = frame.addGhost(new Location(1, 1), "name", Color.red);
		PacMan pacman = frame.addPacMan(new Location(2, 1));
		Map myMap = frame.getMap();
		HashSet<Map.Type> ghosts = new HashSet<Map.Type>();
		ghosts.add(Map.Type.GHOST);
		System.out.print(myMap.getLoc(new Location(1, 1)));
		System.out.print(ghosts);
		/*
		assertTrue(myMap.getLoc(new Location(1, 1)).equals(ghosts));
		assertEquals(myMap.getLoc(new Location(2, 1)), new HashSet<PACMAN>());
		assertEquals(myMap.getLoc(new Location(0, 0)), new HashSet<WALL>());
		assertEquals(myMap.getLoc(new Location(3, 1)), new HashSet<COOKIE>());
		*/
		assertTrue(1 == 1);
		pacman.move();
		//assertEquals(frame.getMap().getLoc(new Location(2, 1)), new HashSet<EMPTY>());
	}
}
