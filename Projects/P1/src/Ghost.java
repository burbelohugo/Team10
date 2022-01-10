import java.util.HashSet;
import java.util.ArrayList;

public class Ghost {
	String myName;
	Location myLoc;
	Map myMap;

	public Ghost(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	public ArrayList<Location> get_valid_moves() {
		return null;
	}

	public boolean move() {
		ArrayList<Location> lst = get_valid_moves();

		if (lst.size() == 0) {
			return false;
		} else {
			myLoc = lst.get(0);
			return true;
		}
	}

	public boolean is_pacman_in_range() {
		return false;
	}

	public boolean attack() {
		return false;
	}
}
