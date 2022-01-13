import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;

public class Map {

	public enum Type {
		EMPTY,
		PACMAN,
		GHOST,
		WALL,
		COOKIE
	}

	private HashMap<Location, HashSet<Type>> field;
	private boolean gameOver;
	private int dim;

	private HashMap<String, Location> locations;
	private HashMap<String, JComponent> components;
	private HashSet<Type> emptySet;
	private HashSet<Type> wallSet;

	private int cookies = 0;

	public Map(int dim) {
		gameOver = false;
		locations = new HashMap<String, Location>();
		components = new HashMap<String, JComponent>();
		field = new HashMap<Location, HashSet<Type>>();

		emptySet = new HashSet<Type>();
		wallSet = new HashSet<Type>();
		emptySet.add(Type.EMPTY);
		wallSet.add(Type.WALL);
		this.dim = dim;
	}

	public void add(String name, Location loc, JComponent comp, Type type) {
		locations.put(name, loc);
		components.put(name, comp);
		if (!field.containsKey(loc))
			field.put(loc, new HashSet<Type>());
		field.get(loc).add(type);
	}

	public int getCookies() {
		return cookies;
	}

	public boolean isGameOver() {
		return gameOver;
	}

	public boolean move(String name, Location loc, Type type) {
		// update locations, components, and field
		// use the setLocation method for the component to move it to the new location
		if (type == Type.PACMAN) {
			// check if other things are in the way, return false
			Location currLoc = locations.get(name);
			if (this.getLoc(loc).contains(Type.WALL) || this.getLoc(loc).contains(Type.PACMAN)) {
				//if there is an wall or a pacman 
				return false;
			}
			PacMan pm = new PacMan(name, currLoc, this);
			this.locations.replace(name, loc);
			this.field.get(currLoc).remove(type);
			this.field.get(loc).add(type);
			this.components.get(name).setLocation(loc.x, loc.y);
			return true;
		} else if (type == Type.GHOST) {
			Location currLoc = locations.get(name);
			//ghosts can walk through pacman
			if (this.getLoc(loc).contains(Type.WALL)) {
				return false;
			}
			Ghost g = new Ghost(name, currLoc, this);
			this.locations.replace(name, loc);
			this.field.get(currLoc).remove(type);
			this.field.get(loc).add(type);
			this.components.get(name).setLocation(loc.x, loc.y);
			return true;
		}
		return false;
	}

	public HashSet<Type> getLoc(Location loc) {
		// wallSet and emptySet will help you write this method
		if (!locations.containsValue(loc))
		  return wallSet;
		else
		  return field.get(loc);
	}

	public boolean attack(String Name) {
		// update gameOver
		Ghost ghost = new Ghost(Name, this.locations.get(Name), this);

		if (ghost.attack() == true) {		// ghost attacks pacman
			// move ghost to pacman's location
			if (move(Name, this.locations.get("pacman"), Type.GHOST)) {
				gameOver = true;		// game over
				return true;
			}
		}

		return false;
	}

	public JComponent eatCookie(String name) {
		// update locations, components, field, and cookies
		// the id for a cookie at (10, 1) is tok_x10_y1

		JComponent comp = components.get(name); // Get the JComponenet for name
		Location loc = locations.get(name); // Get the location for name
		HashSet<Type> set = field.get(loc); // Get the set at the location

		if (!set.contains(Type.COOKIE)) {
			return null; // If there's no cookie, return null
		} else {
			set.remove(Type.COOKIE); // Remove the cookie
			field.replace(loc, set); // Update the field contents with the new set
			cookies++; // Update cookies consumed
			return comp; // Return the JComponent
		}
	}
}
