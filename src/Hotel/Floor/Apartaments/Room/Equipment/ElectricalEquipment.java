package Hotel.Floor.Apartaments.Room.Equipment;

public class ElectricalEquipment extends  RoomNecessity{
    private final double power;
    public ElectricalEquipment(String model, double price,double power) {
        super(model, price);
        this.power = power;
    }

    public double getPower() {
        return power;
    }


}
