
import java.util.ArrayList;

public class Town {
    ArrayList<Building> buildings;

    public Town(){
        this.buildings= new ArrayList<>();
    }

    public int countBuildings(){
        return this.buildings.size();
    }
    public void addBuildings(Building building){

        buildings.add(building);
    }


}
