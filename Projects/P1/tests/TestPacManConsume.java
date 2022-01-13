import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManConsume {
    public void testConsume() {
        Mainframe mainFrame = new Mainframe();
        NoFrame noFrame = new NoFrame();
        PacMan pacman = frame.addPacMan(new Location(1,1));

        assertEquals(pacman.consume(), null);

        mainFrame.getMap.add("tok_x1_y1", new Location(1,1), new CookieComponent() cookie, mainFrame.getMap.Type.COOKIE);
        assertNotEquals(pacman.consume(), null);
    }
}