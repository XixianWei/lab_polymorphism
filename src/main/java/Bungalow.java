import java.time.LocalDate;
import java.util.Date;

public class Bungalow extends Building{

    boolean central_heating;

    public Bungalow (int numberOfRooms, LocalDate dateOfConstruction, boolean central_heating){
        super(numberOfRooms,dateOfConstruction);
    }

    public int calculateCost(){
        return 0;
    }


}
