package fixtures;

import java.util.Arrays;
import java.util.List;

public class Room extends Fixture {
	private Room[] exits;
	   private List<String> drections = Arrays.asList("East", "West", "North", "South");

	   public Room(String name, String shortDescription, String longDescription) {
	       super(name, shortDescription, longDescription);
	       this.exits = new Room[drections.size()];
	       // TODO Auto-generated constructor stub
	   }

	   public Room[] getExits() {
	       return exits;
	   }

	   public Room getExit(String direction) {
	       return exits[drections.indexOf(direction)];
	   }
	  

	   public List<String> getDrections() {
	       return drections;
	   }

	   public void setExits(Room[] exits) {
	       this.exits = exits;
	   }

	   @Override
	   public String toString() {
	       String exits = "";
	       for (String direction : this.drections) {
	           if(getExit(direction)!=null)
	           exits += (direction + ": " + getExit(direction).getShortDescription() + "\n");
	       }
	       return this.getName() + "\n\n" + this.getLongDescription() + "\n\n" + "Exits:\n" + exits;
	   }

	

}
