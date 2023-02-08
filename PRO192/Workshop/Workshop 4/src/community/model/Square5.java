package community.model;

public class Square5 extends Rectangle5 {
	public Square5() {
        super();
    }

    public Square5(double side) {
        super(side, side);
    }

    public Square5(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        // return "A Square with side="+getSide()
        //      + ", which is a subclass of "+super.toString();
        return String.format("A Square with side = %f , which is a subclass of %s"
                            , width, super.toString());
    }
}
