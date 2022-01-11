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
		//check up,down, l, r
		int x = this.myLoc.x;
		int y = this.myLoc.y;
		//ghosts cannot move through walls but they can move through pacman and other ghosts
		ArrayList<Location> valid_moves = new ArrayList<Location>();
		//checking right
		if(!(myMap.getLoc( new Location ( x + 1, y)).contains(Map.Type.WALL))){
			valid_moves.add(new Location (x + 1, y));
		}
		if(!(myMap.getLoc( new Location ( x - 1, y)).contains(Map.Type.WALL))){
			valid_moves.add(new Location (x - 1, y));
		}
		if(!(myMap.getLoc( new Location ( x, y + 1)).contains(Map.Type.WALL))){
			valid_moves.add(new Location (x, y + 1));
		}
		if(!(myMap.getLoc( new Location ( x, y - 1)).contains(Map.Type.WALL))){
			valid_moves.add(new Location (x, y - 1));
		}
		return valid_moves;
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
		if (myMap.getLoc(new Location(myLoc.x - 1, myLoc.y - 1)).contains(Map.Type.PACMAN))
                  return true;
                if (myMap.getLoc(new Location(myLoc.x - 1, myLoc.y)).contains(Map.Type.PACMAN))
                  return true;
                if (myMap.getLoc(new Location(myLoc.x, myLoc.y - 1)).contains(Map.Type.PACMAN))
                  return true;
                if (myMap.getLoc(new Location(myLoc.x - 1, myLoc.y + 1)).contains(Map.Type.PACMAN))
                  return true;
                if (myMap.getLoc(new Location(myLoc.x + 1, myLoc.y + 1)).contains(Map.Type.PACMAN))
                  return true;
                if (myMap.getLoc(new Location(myLoc.x + 1, myLoc.y)).contains(Map.Type.PACMAN))
                  return true;
                if (myMap.getLoc(new Location(myLoc.x, myLoc.y + 1)).contains(Map.Type.PACMAN))
                  return true;
                if (myMap.getLoc(new Location(myLoc.x + 1, myLoc.y - 1)).contains(Map.Type.PACMAN))
                  return true;

                return false;
	}

	public boolean attack() {
		return is_pacman_in_range(); // If PacMan is in range, ghost attacks. If not, ghost doesn't attack.

	}
}
