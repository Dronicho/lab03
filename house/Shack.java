package house;

import java.util.*;

public class Shack {
     
    private String name = "Typiachok";
    private String place = "Dryaning";
    private List<Room> rooms = new ArrayList<Room>();

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public void removeRoom(Room room) {
        this.rooms.remove(room);
    }

    public String getName() {
        return this.name;
    }

    public String getPlace() {
        return this.place;
    }

    public void getRooms() {
        System.out.println("Rooms in the shack are:");
        for (Room room: rooms ){
            System.out.println(room.getName());
        }
    }
}