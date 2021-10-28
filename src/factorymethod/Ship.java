package factorymethod;

public class Ship {

    private String name;
    private String logo;
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", logo='" + logo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
