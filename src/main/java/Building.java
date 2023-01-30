import java.time.LocalDate;
import java.util.Date;

public abstract class Building {
    protected int numberOfRooms;
    protected LocalDate dateOfConstruction;

    public Building(int numberOfRooms, LocalDate dateOfConstruction) {
        this.numberOfRooms= numberOfRooms;
        this.dateOfConstruction = dateOfConstruction;
    }

    abstract int calculateCost();


}
