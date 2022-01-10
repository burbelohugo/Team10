import java.util.HashSet;
import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan{
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
		// check up,down, l, r
		int x = this.myLoc.x;
		int y = this.myLoc.y;

		ArrayList<Location> valid_moves = new ArrayList<Location>();

		if (!(myMap.getLoc(new Location(x + 1, y)).contains(Map.Type.WALL))) {
			valid_moves.add(new Location(x + 1, y));
		}
		if (!(myMap.getLoc(new Location(x - 1, y)).contains(Map.Type.WALL))) {
			valid_moves.add(new Location(x - 1, y));
		}
		if (!(myMap.getLoc(nxew Location(x, y + 1)).contains(Map.Type.WALL))) {
			valid_moves.add(new Location(x, y + 1));
		}
		if (!(myMap.getLoc(new Location(x, y - 1)).contains(Map.Type.WALL))) {
			valid_moves.add(new Location(x, y - 1));
		}
		return valid_moves;
	}

	public boolean move() {
		return false;
	}

	public boolean is_ghost_in_range() { 
		return false;
	}

	public JComponent consume() { 
 		return null;
	}
}
