import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OfficeTest {

    Office office;

    @BeforeEach
    void setUp(){
        office = new Office(3, LocalDate.of(1980,1,2),"HelloWorld");
    }

    @Test
    void canCalculateCost(){
        assertThat(office.calculateCost()).isEqualTo(0);
    }

    @Test
    void canHostMeeting(){
        assertThat(office.holdMeeting()).isEqualTo(true);
    }
}
