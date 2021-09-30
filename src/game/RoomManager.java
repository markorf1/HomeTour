
package game;

import java.util.List;

import fixtures.Room;

public class RoomManager {
   Room startingRoom;
   Room[] rooms;

   public void init() {

       Room foyer = new Room("The Foyer", "a small foyer",
               "The small entrway of a neo-colonial house. A dining Room is open to the South, Where a large table can be seen\n"
                       + "The hardwood floor leads west into doorway, next to a staircase that leads up to a second dloor.\n"
                       + "to the north is a small room, where you can see a piano.");
       List<String> directions = foyer.getDrections();
       rooms = new Room[directions.size()];
       this.startingRoom = foyer;
       Room dining = new Room("The Dining", "a long dining room",
               "The long dining of having dining table and four chairs. A folyer is open to the North, Where a small entrway of a neo-colonial house\n"
                       + "to the south, west, east there is a wall");
       Room library = new Room("The Library", "a cozy Library   ",
               "This square room has the west and south walls Completely covered with built-in bookshelves, the bottoms of which are\n"
                       + "storage cabinates. THe floor is covered in a large persian rug, stop which three antique parlor chairs are arranged\n"
                       + "in the front of bookshelves. A Small cocktail table sits between chairs, hosting a stack of books. A piano sits\n"
                       + "against the north wall, and windows to the east let in the morning sun, The foyer is available to the south.");
       Room interiorDoor = new Room("The Interior", "an interior door",
               "This is an interior door which has all walls\n");

       rooms[directions.indexOf("South")] = dining;
       rooms[directions.indexOf("North")] = library;
       rooms[directions.indexOf("West")] = interiorDoor;
       foyer.setExits(rooms);
       rooms = new Room[directions.size()];
       rooms[directions.indexOf("South")] = foyer;
       rooms[directions.indexOf("West")] = interiorDoor;
       library.setExits(rooms);
       rooms = new Room[directions.size()];
       rooms[directions.indexOf("North")] = foyer;
       rooms[directions.indexOf("West")] = interiorDoor;
       dining.setExits(rooms);
   }
}
