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
		//pacman does not move diagonal
		//check up, down, left, right 
		int X = this.myLoc.x;
		int Y = this.myLoc.y;
		ArrayList<Location> valid_moves = new ArrayList<Location>();

		//up 
		if(myMap.getLoc(new Location(X, Y + 1).)
		return valid_moves;	
	}

	public boolean move() {
		ArrayList<Location> lst = get_valid_moves();

		if (lst.size() == 0) {
			return false;
		} else {
			myLoc = lst.get(0);
			shift 
			return true;
		}
	}

	public boolean is_ghost_in_range() {
		return false;
	}

	public JComponent consume() {
		return null;
	}
}
