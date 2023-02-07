package Templates;

import java.util.ArrayList;

public class TApartment {
    private ArrayList<TRoom> rooms;
    public TApartment(){
        this.rooms = new ArrayList<>();
    }

    public ArrayList<TRoom> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<TRoom> rooms) {
        this.rooms = rooms;
    }

    public void addRoom(TRoom room){
        rooms.add(room);
    }
}
