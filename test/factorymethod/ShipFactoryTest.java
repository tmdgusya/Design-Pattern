package factorymethod;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipFactoryTest {


    @Test
    @DisplayName("하얀배를 객체를 고객정보와 함께 잘 만들어 내는지 확인합니다.")
    void makeWhiteShipFactoryTest() {
        Ship whiteShip = new WhiteShipFactory().orderShip("WhiteShip", "dev0jsh@gmail.com");

        /**
         * default Info Test
         */
        assertEquals(whiteShip.getName(), "whiteship");
        assertEquals(whiteShip.getLogo(), "\uD83D\uDEE5");
        assertEquals(whiteShip.getColor(), "white");
    }

    @Test
    @DisplayName("검은배를 객체를 고객정보와 함께 잘 만들어 내는지 확인합니다.")
    void makeBlackShipFactoryTest() {
        Ship whiteShip = new BlackShipFactory().orderShip("BlackShip", "dev0jsh@gmail.com");

        /**
         * default Info Test
         */
        assertEquals(whiteShip.getName(), "blackship");
        assertEquals(whiteShip.getLogo(), "⚓");
        assertEquals(whiteShip.getColor(), "black");
    }

}