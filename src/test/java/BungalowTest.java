import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BungalowTest {

Bungalow bungalow;

@BeforeEach
    void setUp(){
    bungalow = new Bungalow(2, LocalDate.of(2000,11,12),true);
}

@Test
    void canCalculateCost(){
    assertThat(bungalow.calculateCost()).isEqualTo(0);
}

}
