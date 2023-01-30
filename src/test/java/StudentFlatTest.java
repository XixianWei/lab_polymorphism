import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StudentFlatTest {

    StudentFlat studentFlat;

    @BeforeEach
    void setUp(){
        studentFlat = new StudentFlat(2, LocalDate.of(2000,11,12),22321L);
    }

    @Test
    void canCalculateCost(){
        assertThat(studentFlat.calculateCost()).isEqualTo(0);
    }

}
