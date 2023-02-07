package Templates;

import Hotel.Floor.Apartaments.Room.Equipment.ElectricalEquipment;
import Hotel.Floor.Apartaments.Room.Equipment.Furniture;

import java.util.ArrayList;

public class TRoom {
    private ArrayList<Furniture> furnitures ;
    private ArrayList<ElectricalEquipment> electricalEquipments;

    public TRoom(){
        this.furnitures = new ArrayList<>();
        this.electricalEquipments = new ArrayList<>();
    }

    public ArrayList<Furniture> getFurnitures() {
        return furnitures;
    }

    public void setFurnitures(ArrayList<Furniture> furnitures) {
        this.furnitures = furnitures;
    }

    public ArrayList<ElectricalEquipment> getElectricalEquipments() {
        return electricalEquipments;
    }

    public void setElectricalEquipments(ArrayList<ElectricalEquipment> electricalEquipments) {
        this.electricalEquipments = electricalEquipments;
    }

    public  void addFurniture(Furniture furniture){
        furnitures.add(furniture);
    }
    public void addElectricalEquipment(ElectricalEquipment electricalEquipment){
        electricalEquipments.add(electricalEquipment);
    }
}
