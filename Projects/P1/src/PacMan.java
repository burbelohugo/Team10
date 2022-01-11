import java.util.HashSet;
import java.util.Random;
import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan {
	String myName;
	Location myLoc;
	Map myMap;
	Location shift;
	Random rand;

	public PacMan(String name, Location loc, Map map) {
		this.rand = new Random();
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	public ArrayList<Location> get_valid_moves() {
		// check up,down, l, r
		int x = this.myLoc.x;
		int y = this.myLoc.y;

		ArrayList<Location> valid_moves = new ArrayList<Location>();

		if (!(myMap.getLoc(new Location(x + 1, y)).contains(Map.Type.WALL)) 
		|| !(myMap.getLoc(new Location(x + 1, y)).contains(Map.Type.GHOST))) {
			valid_moves.add(new Location(x + 1, y));
		}
		if (!(myMap.getLoc(new Location(x - 1, y)).contains(Map.Type.WALL)) 
		|| !(myMap.getLoc(new Location(x - 1, y)).contains(Map.Type.GHOST))) {
			valid_moves.add(new Location(x - 1, y));
		}
		if (!(myMap.getLoc(new Location(x, y + 1)).contains(Map.Type.WALL)) 
		|| !(myMap.getLoc(new Location(x, y + 1)).contains(Map.Type.GHOST))) {
			valid_moves.add(new Location(x, y + 1));
		}
		if (!(myMap.getLoc(new Location(x, y - 1)).contains(Map.Type.WALL)) 
		|| !(myMap.getLoc(new Location(x, y - 1)).contains(Map.Type.GHOST))) {
			valid_moves.add(new Location(x, y - 1));
		}
		return valid_moves;
	}

	public boolean move() {
		ArrayList<Location> lst = get_valid_moves();

		if (lst.size() == 0) {
			return false;
		} else {
			myLoc = lst.get(rand.nextInt(lst.size()));
			myMap.move(myName, myLoc, Map.Type.PACMAN);
			return true;
		}
	}

	public boolean is_ghost_in_range() {
		if (myMap.getLoc(new Location(myLoc.x - 1, myLoc.y - 1) == Map.Type.GHOST)
		  return true;
		if (myMap.getLoc(new Location(myLoc.x - 1, myLoc.y) == Map.Type.GHOST)
		  return true;
		if (myMap.getLoc(new Location(myLoc.x, myLoc.y - 1) == Map.Type.GHOST)
		  return true;
		if (myMap.getLoc(new Location(myLoc.x - 1, myLoc.y + 1) == Map.Type.GHOST)
		  return true;
		if (myMap.getLoc(new Location(myLoc.x + 1, myLoc.y + 1) == Map.Type.GHOST)
		  return true;
		if (myMap.getLoc(new Location(myLoc.x + 1, myLoc.y) == Map.Type.GHOST)
		  return true;
		if (myMap.getLoc(new Location(myLoc.x, myLoc.y + 1) == Map.Type.GHOST)
		  return true;
		if (myMap.getLoc(new Location(myLoc.x + 1, myLoc.y - 1) == Map.Type.GHOST)
		  return true;

		return false;
	}

	public JComponent consume() {
		return null;
	}
}
