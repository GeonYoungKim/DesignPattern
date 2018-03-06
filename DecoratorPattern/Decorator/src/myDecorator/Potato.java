package myDecorator;

public class Potato extends PizzaDecoratorCreator {
	public int getPizzaPrice() {
		return super.pizzatotal+8000;
	}

}
