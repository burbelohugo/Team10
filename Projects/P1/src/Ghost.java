import java.util.HashSet;
import java.util.Random;
import java.util.ArrayList;

public class Ghost {
	String myName;
	Location myLoc;
	Map myMap;
	Random rand;

	public Ghost(String name, Location loc, Map map) {
		this.rand = new Random();
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
			myLoc = lst.get(rand.nextInt(lst.size()));
			myMap.move(myName, myLoc, Map.Type.GHOST);
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
