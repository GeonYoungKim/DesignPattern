
public class Espresso extends Decorator{

	static protected int espressoCount=0;
	public Espresso(IBeverage Base) {
		super(Base);
		// TODO Auto-generated constructor stub
	}
	
	public int getTotalPrice() {
		return super.getTotalPrice()+getAddPrice();
	}

	private static int getAddPrice() {
		// TODO Auto-generated method stub
		
		espressoCount+=1;
		int addPrice=100;
		if(espressoCount>1) {
			addPrice=70;
		}
		return addPrice;
		
	}

}
