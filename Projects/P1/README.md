# Autonomous PacMan
By Mei-An Blatchford, Kieran Dougal, Katherine Kemp, and Zayd Choudhary for CMSC388T Winter 2022

![PacMan](pacman.png)

## How to run the game
To run the game, navigate to the folder that contains it. Then run the following commands in your command line. This will require that you have Java isntalled.
```bash
javac -cp "src/" src/*.java
java -cp "src/" StartMenu
```

## PacMan.java
PacMan.java contains the PacMan class, which has methods that allows PacMan to move around the map and eat cookies when possible.

### get_valid_moves()


### move()
This method uses get_valid_moves() to check for possible places that PacMan could move to and then if there are possible moves, it uses the random number generator to choose one of those locations from the list and moves to it. It does this by updating the location of the ghost (myLoc), then it calls the move function on myMap so that this new location is updated on the game board.

The test provided creates a MainFrame and then adds PacMan to it. It then checks PacMan does move from this location, which should be true due to the location he is at. Then two ghosts are added in order to corner PacMan, and we check that he is unable to move.

### is_ghost_in_range()


### consume()


## Ghost.java
Ghost.java contains the Ghost class, which has methods that allows ghosts to move around the map and attack PacMan when possible.

### get_valid_moves()


### move()
This method uses get_valid_moves() to check for possible places that the ghost could move to and then if there are possible moves, it uses the random number generator to choose one of those locations from the list and moves to it. It does this by updating the location of the ghost (myLoc), then it calls the move function on myMap so that this new location is updated on the game board.

The test provided creates a MainFrame and then adds ghosts to it in two different places. Then it checks that the ghosts can move, which should be true because they are not blocked in based on where they are placed.

### is_pacman_in_range()


### attack()


## Map.java
Map.java contains the Map class, which has methods that allows game board to be updated visually.

### move()


### getLoc()


### attack()


### eatCookie()
This method uses the map's hash tables to get information about the JComponent and location for the parameter "name" as well as the Types at that location. Then, if a cookie is in one of those Types, it removes the cookie and increments cookies, which will later increment the score on the game board.

The test provided creates a MainFrame with PacMan and two ghosts. Then, PacMan is prompted to eat a cookie at his current location, which should succeed since the game just started and there are cookies at all valid locations. Then, he is prompted to eat a cookie again, which fails because it has already been eaten.