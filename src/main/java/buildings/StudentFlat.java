package buildings;

import buildings.Building;

public class StudentFlat extends Building {

    long numberOfPartiesHosted;


    public StudentFlat(int numberOfRooms, int rentPrice, long numberOfPartiesHosted) {
        super(numberOfRooms, rentPrice);
        this.numberOfPartiesHosted = numberOfPartiesHosted;
    }


    public int calculateMonthlyFee(){
        return rentPrice/7*30;
    }


    public String holdParties(){
        return "Welcome to the number " + (numberOfPartiesHosted+1) + " party of the student hall.";

    }


}
