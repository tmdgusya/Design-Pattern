package abstract_factory;

/**
 * 배 부품을 만들어 주는 팩토리
 * 추상 팩토리
 */
public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();

}
