package myDecorator;

public class SweetPotato extends PizzaDecoratorCreator {
	public int getPizzaPrice() {
		return super.pizzatotal+9000;
	}

}
