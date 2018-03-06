
public class Milk extends Decorator {

	public Milk(IBeverage Base) {
		super(Base);
		
	}
	public int getTotalPrice() {
		return super.getTotalPrice()+50;
	}

}
