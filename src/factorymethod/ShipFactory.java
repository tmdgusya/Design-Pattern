package factorymethod;

public class ShipFactory {

    public static Ship orderShip(String name, String email) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요");
        }

        prepareFor(name);

        Ship ship = new Ship();
        ship.setName(name);

        if (name.equalsIgnoreCase("whiteship")) {
            ship.setLogo("\uD83D\uDEE5");
            ship.setColor("white");
        } else if (name.equalsIgnoreCase("blackship")) {
            ship.setLogo("⚓️");
            ship.setColor("black");
        }

        sendToEmail(email);

        return ship;
    }

    private static void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    private static void sendToEmail(String email) {
        System.out.println(email + " 고객님 배가 완성되었습니다.");
    }

}
