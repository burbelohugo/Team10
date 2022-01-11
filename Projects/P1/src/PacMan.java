import java.util.HashSet;
import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan {
	String myName;
	Location myLoc;
	Map myMap;
	Location shift;

	public PacMan(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	public ArrayList<Location> get_valid_moves() {
		return null;
	}

	public boolean move() {
		// Katie
		return false;
	}

	public boolean is_ghost_in_range() {
		return false;
	}

	public JComponent consume() {
		// checking if pacman's location contains a cookie
		if (myMap.getLoc(myLoc).contains(Map.Type.COOKIE)) {
			// return JComponent object of Map.eatCookie
			return myMap.eatCookie(myName);
		} else {
			return null;
		}
	}
}
