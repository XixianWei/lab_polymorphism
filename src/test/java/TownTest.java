import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TownTest {

    Town town;

    @BeforeEach
    void setUp(){
        town = new Town();
    }

    @Test
    public void canCountBuildings(){
        assertThat(town.countBuildings()).isEqualTo(0);
    }

    @Test
    public void canAddBuildings(){
        Bungalow bungalow = new Bungalow(2, LocalDate.of(2000,11,12),true);
        town.addBuildings(bungalow);
        assertThat(town.countBuildings()).isEqualTo(1);
    }

}
