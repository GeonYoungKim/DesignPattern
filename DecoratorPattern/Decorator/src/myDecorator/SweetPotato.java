package myDecorator;

public class SweetPotato extends PizzaDecoratorCreator {
	

	public int getPizzaPrice() {
		return super.getPizzaPrice()+9000;
	}

}
