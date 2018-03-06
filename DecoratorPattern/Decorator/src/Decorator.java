
abstract public class Decorator implements IBeverage{

	IBeverage base;
	
	public Decorator(IBeverage Base) {
		super();
		this.base=Base;
	}
	
	
	public int getTotalPrice() {
		
		return base.getTotalPrice();
	}

	public IBeverage getIBeverage() {
		return base;
	}

	
	
	
	

}
