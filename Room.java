package com.demo;

public class Room {
  int roomno;
  String type;
  String roomarea;
  String  ACmachine;

public int getRoomno() {
	return roomno;
}

public void setRoomno(int roomno) {
	this.roomno = roomno;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getRoomarea() {
	return roomarea;
}

public void setRoomarea(String roomarea) {
	this.roomarea = roomarea;
}

public String getACmachine() {
	return ACmachine;
}

public void setACmachine(String aCmachine) {
	ACmachine = aCmachine;
}

	public static void main(String[] args) {
		Room ref=new Room();
		ref.setRoomno(112);
		ref.setRoomarea("third floor");
		ref.setACmachine("ac available");
		String ac=ref.getACmachine();
		int room=ref.getRoomno();
		String area=ref.getRoomarea();
		System.out.println(ac);
		System.out.println(room);
		System.out.println(area);
		System.out.println(ac+" "+room+" "+area);
		
		
		
	

}
}