package Hotel;

import Hotel.Floor.Floor;
import Templates.TFloor;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Floor> floors;
    private final int maxNumberOfFloors;

    public Hotel(String name,int maxNumberOfFloors) {
        this.maxNumberOfFloors = maxNumberOfFloors;
        this.floors = new ArrayList<>();
    }

    private int fromAppNumberToFloorIndex(int appNumber){
        return (appNumber/100)-1;
    }

    public void bookApartment(int appNumber){

        int floorIndex = fromAppNumberToFloorIndex(appNumber);

        floors.get(floorIndex).bookAnApartment(appNumber);
    }

    public void releaseApartment(int appNumber){
        int floorIndex = fromAppNumberToFloorIndex(appNumber);

        floors.get(floorIndex).releaseAnApartment(appNumber);
    }


    public void listAvailableApartments(){
        System.out.println("Available apartments: ");
        for (int i =0 ; i<floors.size();i++) {
            System.out.println("apartments in floor: " + (i+1));
            floors.get(i).ListAvailable();
            System.out.println(" ");

        }
    }



    public void addFloor(TFloor tFloor){
        if (this.floors.size()>=maxNumberOfFloors) return;
        Floor floor = new Floor(tFloor,floors.size()+1);
        floors.add(floor);
        System.out.println("A floor has been added to the hotel");
    }

    public void powerConsumption(){
        double total = 0;
        for (Floor floor: floors) {
            total+= floor.powerConsumption();
        }
        System.out.println("Total power consumption for the hotel is: " + total + "kw");
    }
}
