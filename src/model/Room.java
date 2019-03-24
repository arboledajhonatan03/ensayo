package model;
public class Room{
	private boolean available;
	private int numRoom;
	private Pet pet;
	public Room(boolean available, int numRoom, Pet pet){
		this.available=available;
		this.numRoom=numRoom;
		this.pet = pet;
	}
	public boolean getAvailable(){
		return available;
	}
	public void setAvailable(boolean available){
		this.available = available;
	}
	public int getNumRoom(){
	return numRoom;
	}
	public void setNumRoom(int numRoom){
		this.numRoom = numRoom;
	}
	public Pet getPet(){
	return pet;
	}
	public void setPet(Pet pet){
		this.pet = pet;
	}
	
}