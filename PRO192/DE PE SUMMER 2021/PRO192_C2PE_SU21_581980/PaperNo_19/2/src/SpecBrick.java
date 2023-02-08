
public class SpecBrick extends Brick {
	protected int color;

	public SpecBrick() {
		super();
	}

	public SpecBrick(String place, int price,int color) {
		super(place, price);
		this.color = color;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", "+color;
	}
	public void setData() {
		super.setPlace(place.substring(0,2)+"BCA"+place.substring(2));
	}
	public int getValue() {
		if (color>7) return price +9;
		else {
			return price + 6;
		}
	}
}
