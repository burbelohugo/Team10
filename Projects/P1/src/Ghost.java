import java.util.HashSet;
import java.util.ArrayList;

public class Ghost{
	String myName;
	Location myLoc;
	Map myMap;

	public Ghost(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	public ArrayList<Location> get_valid_moves() {
		//check up,down, l, r
		int x = this.myLoc.x;
		int y = this.myLoc.y;

		ArrayList<Location> valid_moves = new ArrayList<Location>();
		//checking right
		if(!(myMap.getLoc( new Location ( x + 1, y)).contains(Map.Type.WALL))){
			valid_moves.add(new Location (x + 1, y));
		}else if(!(myMap.getLoc( new Location ( x - 1, y)).contains(Map.Type.WALL))){
			valid_moves.add(new Location (x - 1, y));
		}else if(!(myMap.getLoc( new Location ( x, y + 1)).contains(Map.Type.WALL))){
			valid_moves.add(new Location (x, y + 1));
		}else if(!(myMap.getLoc( new Location ( x, y - 1)).contains(Map.Type.WALL))){
			valid_moves.add(new Location (x, y - 1));
		}
		return valid_moves;
	}

	public boolean move() {
		return false;
	}

	public boolean is_pacman_in_range() { 
		return false;
	}

	public boolean attack() {
		return false;
	}
}
