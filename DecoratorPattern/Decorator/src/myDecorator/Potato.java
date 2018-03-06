package myDecorator;

public class Potato extends PizzaDecoratorCreator {
	

	public int getPizzaPrice() {
		return super.getPizzaPrice()+8000;
	}

}
