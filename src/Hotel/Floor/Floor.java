package Hotel.Floor;

import Hotel.Constants;
import Hotel.Floor.Apartaments.Apartment;
import Templates.TApartment;
import Templates.TFloor;

import java.util.ArrayList;

public class Floor{
    private int floorNumber;
    private ArrayList<Apartment> apartments;

    public Floor(TFloor tFloor,int floorNumber) {
        this.apartments = new ArrayList<>();
        this.floorNumber = floorNumber;
        for (TApartment tApartment : tFloor.getApartments()) {
            addApartment(tApartment);
        }
    }



    public void addApartment(TApartment tApartment){
        if (getNumberOfRooms()>= Constants.MAXIMUM_AMOUNT_OF_ROOMS) return;
        Apartment apartment = new Apartment(tApartment);
        apartment.setApartmentNumber(floorNumber*100 + apartments.size());
        apartments.add(apartment);
        System.out.println("An apartment has been added to the floor");
    }

    public void bookAnApartment(int appNumber){
        for (Apartment apartment : apartments) {
            if (apartment.getApartmentNumber()==appNumber ) {
                if (!apartment.isFlag()) {
                    apartment.setFlag(true);
                    System.out.println("apartment " +appNumber + " was booked!");

                }
                else System.out.println("apartment " + appNumber + " is taken");
                break;
            }

        }
    }

    public void releaseAnApartment(int appNumber){
        for (Apartment apartment : apartments) {
            if (apartment.getApartmentNumber()==appNumber ) {
                if (apartment.isFlag()) {
                    apartment.setFlag(false);
                    System.out.println("apartment " +appNumber + " was released!");

                }
                else System.out.println("apartment " + appNumber + " isn't taken");
                break;
            }

        }
    }

        public void ListAvailable(){
            for (Apartment apartment : apartments){
                if (!apartment.isFlag())
                System.out.print(apartment.getApartmentNumber()+1 + " ");
            }
        }



    private int getNumberOfRooms(){
        int count = 0;
        for (Apartment apartment : apartments){
            count+=apartment.getRooms().size();

        }
        return count;
    }

    public double powerConsumption(){
        double total = 0;
        for (Apartment apartment: apartments) {
            total+=apartment.powerConsumption();
        }
        return total;
    }
}



