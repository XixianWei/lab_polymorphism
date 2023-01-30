import java.time.LocalDate;
import java.util.Date;

public class StudentFlat extends Building{

    long numberOfPartiesHosted;

    public StudentFlat(int numberOfRooms, LocalDate dateOfConstruction,long numberOfPartiesHosted){
        super(numberOfRooms, dateOfConstruction);
        this.numberOfPartiesHosted = numberOfPartiesHosted;
    }

    public int calculateCost(){
        return 0;
    }


}
