package myDecorator;

public class Peparony extends ToppingDecoratorCreator{
	public Peparony(Object ob) {
		super(ob);
		// TODO Auto-generated constructor stub
	}

	public int getToppingPrice() {
		return super.getToppingPrice()+2000;
	}

}
