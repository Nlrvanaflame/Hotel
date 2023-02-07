import Hotel.Floor.Apartaments.Room.Equipment.ElectricalEquipment;
import Hotel.Hotel;
import Templates.TApartment;
import Templates.TFloor;
import Templates.TRoom;


public class Main {
    public static void main(String[] args) {

        ElectricalEquipment lamp = new ElectricalEquipment("idk",5,100);
        TRoom kidsRoom = new TRoom();
        kidsRoom.addElectricalEquipment(lamp);

        TRoom kitchen = new TRoom();

        TApartment burjoaziqApartment = new TApartment();
        burjoaziqApartment.addRoom(kitchen);
        burjoaziqApartment.addRoom(kidsRoom);

        TFloor richFloor = new TFloor();
        richFloor.addApartment(burjoaziqApartment);
        richFloor.addApartment(burjoaziqApartment);

        Hotel hotel = new Hotel("Casablanca",5);
        hotel.addFloor(richFloor);
        hotel.addFloor(richFloor);
        hotel.addFloor(richFloor);
        hotel.addFloor(richFloor);






        hotel.powerConsumption();
        hotel.listAvailableApartments();

    }



}
