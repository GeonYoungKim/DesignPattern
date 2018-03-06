package myDecorator;

public class Cheeze extends ToppingDecoratorCreator{
	public int getToppingPrice() {
		return super.toppingtotal+1000;
	}
}
