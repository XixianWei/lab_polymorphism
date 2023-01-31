package buildings;

import buildings.Building;
import interfaces.Rentable;

import java.util.ArrayList;

public class RealEstateAgent implements Rentable {
    ArrayList<Building> toLet;

    public RealEstateAgent(){
        this.toLet= new ArrayList<>();
    }

    public int countBuildings(){
        return this.toLet.size();
    }
    public void addBuildings(Building building){
        toLet.add(building);
    }


    @Override
    public String countNumberToRent() {
        return "You can rent " + toLet.size() + " property from this shop.";
    }
}
