package buildings;

import buildings.Building;
import interfaces.Rentable;

public class Bungalow extends Building implements Rentable {

    boolean central_heating;

    public Bungalow(int numberOfRooms, int rentPrice,boolean central_heating) {
        super(numberOfRooms, rentPrice);
        this.central_heating = central_heating;
    }


    public int calculateMonthlyFee(){
        return rentPrice;
    }

    public String sayWelcome(){
        return "Welcome!";
    }

    public String sayWelcome(String message){
        return "Welcome " + message +".";
    }

    @Override
    public String countNumberToRent() {
        return "You can rent a " + numberOfRooms + " room bungalow.";
    }
}
