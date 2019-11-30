package creature;

import house.*;
import status.*;

public class Human extends Creature {

    private Room room = null;
    private Double temperature = 36.6;
    private String neckStatus = "Pretty good neck";
    private boolean sleeping = false;
    private int damage = 50;

    public Human(String name, String type, Room room){
        super(name, type);
        this.room = room;
    }

    // public void setStatus(Status status) {
    //     this.status = status;
    // }

    public void setNeckStatus(String status){
        this.neckStatus = status;
    }

    public String getNeckStatus(){
        return neckStatus;
    }

    public void tread(Creature opp) {
        opp.applyDamage(this.damage);
    }

    public void dream() {

        //imaginary fights with rats
        //wakeUp() in a sweat if died, else wakeUp() normaly
    }

    public void changeRoom(Room room) {
        this.room = room;
    }

    public String getRoom(){
        System.out.println(this.name + " lives in room number: " + room.getName());
        return room.getName();
    }

}