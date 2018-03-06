package myDecorator;

public class Cheeze extends ToppingDecoratorCreator{
	public Cheeze(Object ob) {
		super(ob);
		// TODO Auto-generated constructor stub
	}

	public int getToppingPrice() {
		return super.getToppingPrice()+1000;
	}
}
