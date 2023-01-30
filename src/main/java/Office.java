import java.time.LocalDate;
import java.util.Date;

public class Office extends Building{

    public String companyName;

    public Office(int numberOfRooms, LocalDate dateOfConstruction, String companyName){
        super (numberOfRooms,dateOfConstruction);
        this.companyName = companyName;
    }

    public int calculateCost(){
        return 0;
    }

    public boolean holdMeeting(){
        return true;
    }

}
