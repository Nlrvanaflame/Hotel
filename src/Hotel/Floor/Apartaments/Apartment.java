package Hotel.Floor.Apartaments;

import Hotel.Floor.Apartaments.Room.Room;
import Templates.TApartment;
import Templates.TRoom;

import java.util.ArrayList;

public class Apartment {
    private boolean flag;
    private final int maxNumberOfRooms = 5;
    private int apartmentNumber;
    private ArrayList<Room> rooms;


    public Apartment(TApartment tApartment) {
        this.rooms = new ArrayList<>();
        this.flag = false;
        for (TRoom tRoom: tApartment.getRooms()) {
            addRoom(tRoom);
        }
    }


    public ArrayList<Room> getRooms() {
        return rooms;
    }


    public void addRoom(TRoom tRoom){
        if (this.rooms.size()>= maxNumberOfRooms) return;
        this.rooms.add(new Room(tRoom));
    }


    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public boolean isFlag() {
        return flag;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public double powerConsumption(){
        double total=0;
        for (Room room:rooms) {
            total += room.powerConsumption();
        }
        return total;
    }


}
