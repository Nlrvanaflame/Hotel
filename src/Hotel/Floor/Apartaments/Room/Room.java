package Hotel.Floor.Apartaments.Room;

import Hotel.Floor.Apartaments.Room.Equipment.ElectricalEquipment;
import Hotel.Floor.Apartaments.Room.Equipment.Furniture;
import Hotel.Floor.Apartaments.Room.Equipment.RoomNecessity;
import Templates.TRoom;

import java.util.ArrayList;

public class Room {

    private ArrayList<Furniture> furniture;
    private ArrayList<ElectricalEquipment> electricalEquipments;

    public Room(TRoom tRoom) {
        this.furniture = new ArrayList<>();
        this.electricalEquipments = new ArrayList<>();

        this.electricalEquipments.addAll(tRoom.getElectricalEquipments());
        this.furniture.addAll(tRoom.getFurnitures());
    }


    public ArrayList<ElectricalEquipment> getElectricalEquipments() {
        return electricalEquipments;
    }

    public  void ListEquipment(){
        for (RoomNecessity roomNecessity:
             electricalEquipments) {
            System.out.println(roomNecessity.getModel());
        }
        for (RoomNecessity roomNecessity:
                furniture) {
            System.out.println(roomNecessity.getModel());
        }

    }



    public  void addFurniture(Furniture furniture){
        this.furniture.add(furniture);
        System.out.println(furniture + "has been added to the room");
    }
    public void addElectricalEquipment(ElectricalEquipment electricalEquipment){
        this.electricalEquipments.add(electricalEquipment);
        System.out.println(electricalEquipment + "has been added to the room");
    }


    public double powerConsumption(){
        double total = 0;
        for (ElectricalEquipment electricalEquipment : electricalEquipments) {
            total += electricalEquipment.getPower();
        }
        return total;
    }
}
