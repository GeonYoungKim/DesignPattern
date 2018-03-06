package myDecorator;

public class Combination extends PizzaDecoratorCreator {
	



	public int getPizzaPrice() {
		return super.getPizzaPrice()+7000;
	}
	

}
