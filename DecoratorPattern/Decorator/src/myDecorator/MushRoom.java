package myDecorator;
public class MushRoom extends ToppingDecoratorCreator{
	public int getToppingPrice() {
		return super.toppingtotal+500;
	}

}
