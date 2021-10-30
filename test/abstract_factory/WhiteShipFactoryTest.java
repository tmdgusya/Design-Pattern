package abstract_factory;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhiteShipFactoryTest {


    @Test
    @DisplayName("기본 부품을 제공하는 클래스로 만들며, 기존 코드를 변경시키지 않는지 확인합니다.")
    void createWhiteShipDefaultPartsTest() {

        ShipPartsFactory shipPartsFactory = new WhiteShipPartsFactory();

        WhiteShipFactory whiteShipFactory = new WhiteShipFactory(shipPartsFactory);

        Ship ship = whiteShipFactory.createShip();

        assertEquals(ship.getAnchor().getClass(), WhiteAnchor.class);
        assertEquals(ship.getWheel().getClass(), WhiteWheel.class);
    }

    @Test
    @DisplayName("프로 부품을 제공할때도 클래스의 변경없이 가능한지를 테스트 합니다.")
    void createWhiteShipProPartsTest() {
        ShipPartsFactory shipPartsFactory =  getWhiteShipProPartsFactory();

        WhiteShipFactory whiteShipFactory = new WhiteShipFactory(shipPartsFactory);

        Ship ship = whiteShipFactory.createShip();

        assertEquals(ship.getAnchor().getClass(), WhiteAnchorPro.class);
        assertEquals(ship.getWheel().getClass(), WhiteWheelPro.class);
    }


    ShipPartsFactory getWhiteShipProPartsFactory() {
        ShipPartsFactory shipPartsFactory = new ShipPartsFactory() {
            @Override
            public Anchor createAnchor() {
                return new WhiteAnchorPro();
            }

            @Override
            public Wheel createWheel() {
                return new WhiteWheelPro();
            }
        };

        return shipPartsFactory;
    }

}