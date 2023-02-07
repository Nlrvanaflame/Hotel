package Templates;

import java.util.ArrayList;

public class TFloor {
    private ArrayList<TApartment> apartments;

    public TFloor(){
        this.apartments = new ArrayList<>();
    }

    public ArrayList<TApartment> getApartments() {
        return apartments;
    }

    public void setApartments(ArrayList<TApartment> apartments) {
        this.apartments = apartments;
    }

    public void addApartment(TApartment apartment){
        apartments.add(apartment);
    }
}
