import buildings.Bungalow;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BungalowTest {

Bungalow bungalow;

@BeforeEach
    void setUp(){
    bungalow = new Bungalow(2, 1200,true);
}

@Test
    void canCalculateMonthlyFee(){
    assertThat(bungalow.calculateMonthlyFee()).isEqualTo(1200);
}

@Test
    void canSayWelcome_noMessage(){
    String expected = "Welcome!";
    assertThat(bungalow.sayWelcome()).isEqualTo(expected);
}

@Test
    void canSayWelcome_withMessage(){
    String expected = "Welcome to your bungalow.";
    assertThat(bungalow.sayWelcome("to your bungalow")).isEqualTo(expected);

}

@Test
    void canCountNumberToRent(){
    bungalow = new Bungalow(2, 1200,true);
    String expected = "You can rent a 2 room bungalow.";
    assertThat(bungalow.countNumberToRent()).isEqualTo(expected);
}

}
