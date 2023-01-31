package buildings;

import java.time.LocalDate;
import java.util.Date;

public abstract class Building {
    protected int numberOfRooms;
    protected int rentPrice;
    //for studentFlat we offer a weekly fee.
    //for bungalow monthly fee.
    //for office annual.
    private LocalDate dateOfConstruction;


    public Building(int numberOfRooms, int rentPrice){
        this.numberOfRooms = numberOfRooms;
        this.rentPrice = rentPrice;
    }


    abstract int calculateMonthlyFee();

}
