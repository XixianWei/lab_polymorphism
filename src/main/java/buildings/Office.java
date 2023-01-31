package buildings;

import buildings.Building;

public class Office extends Building {

    public String companyName;
    public int capacity;

    public Office(int numberOfRooms, int rentPrice, String companyName, int capacity){
        super (numberOfRooms,rentPrice);
        this.companyName = companyName;
        this.capacity = capacity;
    }

    public int calculateMonthlyFee(){
        return rentPrice/365*30;
    }

    public String holdMeeting(){

        return "This office can hold a meeting of " + capacity + " people.";
    }

}
