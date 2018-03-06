package myDecorator;

public class Peparony extends ToppingDecoratorCreator{
	public int getToppingPrice() {
		return super.toppingtotal+2000;
	}

}
