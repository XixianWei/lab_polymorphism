import buildings.Office;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OfficeTest {

    Office office;

    @BeforeEach
    void setUp(){
        office = new Office(3,14600, "Duolingo",10);
    }

    @Test
    void canCalculateMonthlyFee(){
        assertThat(office.calculateMonthlyFee()).isEqualTo(1200);
    }

    @Test
    void canHostMeeting(){
        assertThat(office.holdMeeting()).isEqualTo("This office can hold a meeting of 10 people.");
    }
}
