import buildings.StudentFlat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StudentFlatTest {

    StudentFlat studentFlat;

    @BeforeEach
    void setUp(){
        studentFlat = new StudentFlat(2, 280,1234L);
    }

    @Test
    void canCalculateMonthlyFee(){
        assertThat(studentFlat.calculateMonthlyFee()).isEqualTo(1200);
    }

    @Test
    void canHoldParties(){
        assertThat(studentFlat.holdParties()).isEqualTo("Welcome to the number 1235 party of the student hall.");
    }

}
