import buildings.Bungalow;
import buildings.RealEstateAgent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RealEstateAgentTest {

    RealEstateAgent realEstateAgent;

    @BeforeEach
    void setUp(){
        realEstateAgent = new RealEstateAgent();
    }

    @Test
    public void canCountBuildings(){
        assertThat(realEstateAgent.countBuildings()).isEqualTo(0);
    }

    @Test
    public void canAddBuildings(){
        Bungalow bungalow = new Bungalow(2, 1200,true);
        realEstateAgent.addBuildings(bungalow);
        assertThat(realEstateAgent.countBuildings()).isEqualTo(1);
    }

    @Test
    public void canCountNumberToRent(){
        Bungalow bungalow = new Bungalow(2, 1200,true);
        realEstateAgent.addBuildings(bungalow);
        assertThat(realEstateAgent.countNumberToRent()).isEqualTo("You can rent 1 property from this shop.");
    }

}
