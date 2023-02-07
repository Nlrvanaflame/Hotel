package Hotel.Floor.Apartaments.Room.Equipment;

public class RoomNecessity {
    private final String model;
    private final double price;

    public RoomNecessity(String model,double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}
