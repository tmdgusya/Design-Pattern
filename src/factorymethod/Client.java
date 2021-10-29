package factorymethod;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteShip = new WhiteShipFactory().orderShip("WhiteShip", "dev0jsh@gmail.com");
        System.out.println(whiteShip);

        Ship blackShip = new BlackShipFactory().orderShip("BlackShip", "dev0jsh@gmail.com");
        System.out.println(blackShip);
    }

}
