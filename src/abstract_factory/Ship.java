package abstract_factory;

public class Ship {

    private Anchor anchor;
    private Wheel wheel;

    public Anchor getAnchor() {
        return anchor;
    }

    public void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "anchor=" + anchor +
                ", wheel=" + wheel +
                '}';
    }
}
