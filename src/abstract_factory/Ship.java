package abstract_factory;

public class Ship {

    private WhiteAnchor anchor;
    private WhiteWheel wheel;

    public WhiteAnchor getAnchor() {
        return anchor;
    }

    public void setAnchor(WhiteAnchor anchor) {
        this.anchor = anchor;
    }

    public WhiteWheel getWheel() {
        return wheel;
    }

    public void setWheel(WhiteWheel wheel) {
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
